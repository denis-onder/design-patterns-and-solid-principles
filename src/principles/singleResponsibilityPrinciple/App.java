package principles.singleResponsibilityPrinciple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
	public static final int INPUT_COUNT_LIMIT = 5;

	private static List<Integer> readInput() {
		List<Integer> inputs = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please provide " + INPUT_COUNT_LIMIT + " numbers between between 0 and 10:");

		while (inputs.size() < INPUT_COUNT_LIMIT) {
			String input = scanner.nextLine();

			if (!isInputValid(input)) {
				System.err.println("This value is not supported.");
				continue;
			} else {
				inputs.add(Integer.valueOf(input));
			}
		}

		scanner.close();

		return inputs;
	}

	private static boolean isInputValid(String input) {
		try {
			int parsed = Integer.parseInt(input);
			return parsed > 0 && parsed <= 10;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static void sortIntegers(List<Integer> integers) {
		Collections.sort(integers);
	}

	private static void printSortedIntegers(List<Integer> integers) {
		System.out.println("Sorted:");
		for (Integer integer : integers) {
			System.out.println(integer);
		}
	}

	public static void main(String[] args) {
		List<Integer> inputs = readInput();

		sortIntegers(inputs);

		printSortedIntegers(inputs);
	}

}
