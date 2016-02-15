package operation;

import java.time.chrono.JapaneseChronology;
import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = scanner.next();

		System.out.println("국어: ");
		int kor = scanner.nextInt();
		System.out.println("영어: ");
		int eng = scanner.nextInt();
		System.out.println("수학: ");
		int math = scanner.nextInt();
		System.out.println("과학: ");
		int sci = scanner.nextInt();

		int total = kor + eng + math + sci;
		double avg = total / 4;
		String result = name + "의 총점은 " + total + "점이고, 평균은 " + avg + "점으로";
		if (avg >= 90.0) {
			// 인천시 남구 매소홀로475번길 18
			System.out.println(result + " 장학생입니다.");
		} else if (avg >= 60.0) {
			System.out.println(result + " 합격입니다.");
		} else {
			System.out.println(result + " 불합격입니다.");
		}
		// 학생 이름, 국어, 영어, 수학, 과학 의 총점
	}
}
