package app.algorithm.sort;

public class SelectionSort {

	public static int[] solution(int[] input) {

		for (int i = 0; i < input.length -1; i++) {
			
			int index = i;
			for (int j = i + 1; j < input.length; j++) {
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