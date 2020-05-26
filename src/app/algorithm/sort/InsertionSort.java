package app.algorithm.sort;

public class InsertionSort {

	public static int[] solution(int[] input) {

		for (int i = 1; i < input.length; i++) {
			int tmp = input[i];
			int j = i;

			for (j = i - 1; j >= 0; j--) {
				if (input[j] > tmp) {
					input[j + 1] = input[j];
				} else {
					break;
				}
			}
			input[j + 1] = tmp;
		}
		return input;
	}

}
