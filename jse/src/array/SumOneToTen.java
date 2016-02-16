package array;

public class SumOneToTen {
	public static void main(String[] args) {
		//int[] arr = new int[];

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		/*for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}*/
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
