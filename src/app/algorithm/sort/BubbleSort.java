package app.algorithm.sort;

public class BubbleSort {

	public static int[] solution(int[] input) {

		for (int i = 0; i < input.length; i++) {
			
			for (int j = input.length - 1; j > i; j--) {
				
				if (input[j - 1] > input[j]) {
					
					int temp = input[j - 1];
					input[j - 1] = input[j];
					input[j] = temp;
					
				}
				
			}
			
		}
		return input;
	}

}
