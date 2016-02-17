package bank;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		//AdminService service = new AdminServiceImpl();
		AccountService service = new AccountServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 비밀번호: ");
		System.out.println(service.open(scanner.next(), scanner.nextInt()));
		System.out.println(service.deposit(780000));
		System.out.println(service.withdraw(9050000));
		System.out.println(service.search());
		// [한빛뱅크] 홍길동 : 1234계좌, 잔고 1000원
	}
}
