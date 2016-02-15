package operation;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		boolean b = true;
		char c = 'c';
		int i = 3;
		long l = 333L;
		float f = 3.33f;
		double d = 3.000003d;
		String str = "hong";
		System.out.println(str + i); // 가독성 ㄴㄴ
		System.out.println(str); // 연식이 오바함
		
		System.out.println("얼마입니까?");
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		System.out.println(price + "원 입니다.");
		
		System.out.println("이것은 무엇입니까?");
		String what = scanner.next();
		System.out.println(what + "입니다.");
	}
}