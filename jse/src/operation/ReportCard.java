package operation;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = scanner.next();

		System.out.println("국어: ");
		int korean = scanner.nextInt();
		System.out.println("영어: ");
		int english = scanner.nextInt();
		System.out.println("수학: ");
		int math = scanner.nextInt();
		System.out.println("과학: ");
		int science = scanner.nextInt();

		int total = korean + english + math + science;
		int avg = total / 4;
		System.out.println(name + "의 총점은 " + total + "이고, 평균은 " + avg + "입니다.");
		// 학생 이름, 국어, 영어, 수학, 과학 의 총점
	}
}
