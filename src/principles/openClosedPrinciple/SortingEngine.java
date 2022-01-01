package principles.openClosedPrinciple;

public class SortingEngine {

	private ISortingAlgorithm algorithm;

	public SortingEngine(ISortingAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public void sort(int arr[]) {
		algorithm.sort(arr);
	}
}
