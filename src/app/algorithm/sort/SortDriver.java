package app.algorithm.sort;

public class SortDriver {

	public static void main(String[] args) {
		int[] BSInput = { 5, 7, 6, 8, 3, 1, 2, 9, 4, 0 };
		int[] SSInput = { 5, 7, 6, 8, 3, 1, 2, 9, 4, 0 };
		int[] ISInput = { 5, 7, 6, 8, 3, 1, 2, 9, 4, 0 };

		int[] BSOutput = BubbleSort.solution(BSInput);
		System.out.print("BubbleSort : ");
		for(int a : BSOutput) {
			System.out.print(a);
		}
		System.out.println();

		
		int[] SSOutput = SelectionSort.solution(SSInput);
		System.out.print("SelectionSort : ");
		for(int a : SSOutput) {
			System.out.print(a);
		}
		System.out.println();
		
		int[] ISOutput = InsertionSort.solution(ISInput);
		System.out.print("InsertionSort : ");
		for(int a : ISOutput) {
			System.out.print(a);
		}
		System.out.println();
		
		

	}

}
