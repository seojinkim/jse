package bank;

import java.util.Scanner;

public class AdminController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AdminService admin = new AdminServiceImpl();
		while (true) {
			System.out.println("=== 업무선택 ===\n"
					+ "1.전체 계좌 수 조회\n"
					+ "2.계좌번호로 해당 계좌 정보 조회\n"
					+ "3.이름으로 계좌 정보 조회\n"
					+ "4.계좌 삭제\n"
					+ "5.이름으로 계좌 수 조회\n"
					+ "6.통장 개설\n"
					+ "9.종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("총계좌수 : " + admin.countAll());
				break;
			case 2:
				System.out.println("조회하려는 계좌번호 입력 : ");
				System.out.println("조회한 계좌 : " + admin.searchAccountByAccountNo(scanner.nextInt()).toString());
				break;
			case 3:
				System.out.println("조회하려는 이름 입력 : ");
				AccountBean[] accounts = admin.searchAccountByName(scanner.next());
				for (int i = 0; i < accounts.length; i++) {
					System.out.println(accounts[i]);
				}
				break;
			case 4:
				System.out.println("삭제하려는 계좌 입력 : ");
				System.out.println("삭제된 계좌: " + admin.closeAccount(scanner.nextInt()) );
				break;
			case 5:
				System.out.println("조회하려는 이름 입력 : ");
				System.out.println(admin.searchCountByName(scanner.next()));
				break;
			case 6:
				System.out.println("이름, 비밀번호: ");
				System.out.println(admin.open(scanner.next(), scanner.nextInt()));
				break;
			case 9:
				return;
			default:
				break;
			}
		}
	}
}
