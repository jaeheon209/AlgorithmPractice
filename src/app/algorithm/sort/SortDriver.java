package app.algorithm.sort;

public class SortDriver {

	public static void main(String[] args) {
		int[] input = { 5, 7, 6, 8, 3, 1, 2, 9, 4, 0 };

		int[] BSoutput = BubbleSort.solution(input);
		System.out.print("BubbleSort : ");
		for(int a : BSoutput) {
			System.out.print(a);
		}
		System.out.println();

		
		int[] SSoutput = SelectionSort.solution(input);
		System.out.print("SelectionSort : ");
		for(int a : SSoutput) {
			System.out.print(a);
		}
		System.out.println();
		
		
		

	}

}
