package switchcase;

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
		/*if (avg >= 90.0) {
			System.out.println(result + " 장학생입니다.");
		} else if (avg >= 60.0) {
			System.out.println(result + " 합격입니다.");
		} else {
			System.out.println(result + " 불합격입니다.");
		}*/
		// 학생 이름, 국어, 영어, 수학, 과학 의 총점
		
		
		int key = (int) (avg/10); // 지역변수의 초기화
		String result2 = "";
		
		switch (key) {
		case 9: case 10:
			result2 = "장학생입니다.";
			break;
		case 6:case 7:case 8:
			result2 = "합격입니다.";
			break;
		default:
			result2 = "불합격입니다.";
			break;
		}
		
		System.out.println(result + result2);
	}
}
