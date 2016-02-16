package oop;

import java.util.Scanner;

public class DateMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateService service = new DateServiceImpl();
		System.out.println("월을 입력하면 해당 월의 끝날이 몇일인지 출력하는 프로그램");
		System.out.println("월을 입력하세요:");
		System.out.println(service.getEndDate(scanner.nextInt()));
	}
}
