package principles.openClosedPrinciple;

public class App {

	private static void printSortedInput(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int input[] = { 12, 11, 13, 5, 6, 7 };

		ISortingAlgorithm algorithm = new MergeSortAlgorithm();
		SortingEngine engine = new SortingEngine(algorithm);

		engine.sort(input);

		printSortedInput(input);
	}

}
