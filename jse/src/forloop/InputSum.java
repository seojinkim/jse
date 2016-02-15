package forloop;

import java.util.Scanner;

public class InputSum {
	// 두개의 정수를 입력받아서 그 범위내의 정수의 합 구하기 (단, 음수는 없음)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수 입력");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int max = (num1 > num2) ? num1 : num2;
		int min = (num1 < num2) ? num1 : num2;
		int sum = 0;
		for (int i = min + 1; i < max; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
