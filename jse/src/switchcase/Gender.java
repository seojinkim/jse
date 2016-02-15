package switchcase;

import java.util.Scanner;

public class Gender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름?");
		String name = scanner.next();
		System.out.println("주민번호?");
		String ssn = scanner.next();

		char index = ssn.charAt(7);

		switch (index) {
		case '1': case '3':
			System.out.println("내국인 남자");
			break;
		case '2': case '4':
			System.out.println("내국인 여자");
			break;
		case '5':
			System.out.println("외국인 남자");
			break;
		case '6':
			System.out.println("외국인 여자");
			break;
		default:
			System.out.println("오류");
			break;
		}
	}
}
