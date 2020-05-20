package app.algorithm.sort;

public class SortDriver {

	public static void main(String[] args) {
		int[] input = { 5, 7, 6, 8, 3, 1, 2, 9, 4, 0 };

		int[] output = BubbleSort.solution(input);
		
		System.out.print("BubbleSort : ");
		for(int a : output) {
			System.out.print(a);
		}

	}

}
