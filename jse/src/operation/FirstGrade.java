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
		
		String first;
		if (avg1 > avg2 && avg1 > avg3) {
			first = name1;
		} else if (avg2 > avg1 && avg2 > avg3) {
			first = name2;
		} else {
			first = name3;
		}
		
		System.out.println(first +"님이 1등입니다.");
	}
}
