package app.algorithm.sort;

public class SelectionSort {

	public static int[] solution(int[] input) {

		for (int i = 0; i < input.length -1; i++) {
			System.out.println("i : " + i);
			
			int index = i;
			for (int j = i + 1; j < input.length; j++) {
				System.out.println("j : " + j);
				if (input[index] > input[j]) {
					index = j;
				}
			
			}
			
			int temp = input[i];
			input[i] = input[index];
			input[index] = temp;
		}
		
		return input;
	}
}