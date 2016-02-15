package operation;

import java.util.Scanner;

public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** 초를 시간과 분과 초로 바꾸어 주는 프로그램 ***");
		System.out.println("초를 입력하세요");
		
		/**
		 * + - * / % 
		 * sec, hour, min
		 * */
		int sec = scanner.nextInt();
		int min = sec / 60;
		sec %= 60;
		int hour = min / 60;
		min %= 60;

		System.out.println(hour + "시간 " + min + "분 " + sec + "초");
	}
}
