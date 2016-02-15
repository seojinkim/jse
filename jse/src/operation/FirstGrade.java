package operation;

import java.util.Scanner;

public class FirstGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/**
		 * 첫번째 학생 이름과 평균
		 * 두번째 
		 * 세번째 
		 * 
		 * 결과 : 홍길동이 1등입니다.
		 * */

		String name1, name2, name3;
		int avg1, avg2, avg3;
		System.out.println("첫번째 학생의 이름");
		name1 = scanner.next();
		System.out.println("첫번째 학생의 평균");
		avg1 = scanner.nextInt();
		System.out.println("두번째 학생의 이름");
		name2 = scanner.next();
		System.out.println("두번째 학생의 평균");
		avg2 = scanner.nextInt();
		System.out.println("세번째 학생의 이름");
		name3 = scanner.next();
		System.out.println("세번째 학생의 평균");
		avg3 = scanner.nextInt();

		String firstName = null; //지역 변수 local variable
		// 지역변수는 반드시 초기화를 해야한다.
		// 초기화란 최초 지역변수를 선언할 때 null 값을 할당하는 것
		// 변수는 카멜표기법(낙타)으로 표기한다.
		// 클래스는 파스칼표기법으로 표기한다.
		if (avg1 > avg2 && avg1 > avg3) {
			firstName = name1;
		} else if (avg2 > avg3) {
			firstName = name2;
		} else {
			firstName = name3;
		}

		System.out.println(firstName + "님이 1등입니다.");
	}
}
