package operation;

import java.util.Scanner;

public class Kaup {
	/**
	 * 키를 입력하세요
	 * height
	 * 몸무게를 입력하세요
	 * weight
	 * 카우푸 인덱스
	 * index = (몸무게 / (키*키)) * 10000
	 * index > 30 비만
	 * > 24 과체중
	 * > 20 정상
	 * > 15 저체중
	 * > 13 마름
	 * > 10 영양실조
	 * 소모증
	 * 
	 * 결과 : 홍길동님은 과체중입니다.
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름: ");
		String name = scanner.next();
		System.out.println("키 :");
		double height = scanner.nextDouble();
		System.out.println("몸무게 :");
		double weight = scanner.nextDouble();
		int index = (int)((weight / (height * height)) * 10000);

		String status;
		if(index > 30) {
			status = "비만";
		} else if (index > 24) {
			status = "과체중";
		} else if (index > 20) {
			status = "정상";
		} else if (index > 15) {
			status = "저체중";
		} else if (index > 13) {
			status = "마름";
		} else if (index > 10) {
			status = "영양실조";
		} else {
			status = "소모증";
		}
		System.out.println(name + "님은 " + status + "입니다.");
	}
}
