package principles.singleResponsibilityPrinciple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
	public static final int INPUT_COUNT_LIMIT = 5;

	private static List<String> readInput() {
		List<String> inputs = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please provide " + INPUT_COUNT_LIMIT + " numbers between between 0 and 10:");

		while (inputs.size() < INPUT_COUNT_LIMIT) {
			String input = scanner.nextLine();
			inputs.add(input);
		}

		scanner.close();

		return inputs;
	}

	private static boolean isInputValid(List<String> inputs) {
		for (String input : inputs) {
			try {
				Integer.parseInt(input);
			} catch (NumberFormatException e) {
				return false;
			}
		}

		return true;
	}

	private static List<Integer> mapInputsToIntegers(List<String> inputs) {
		return inputs.stream().map(input -> Integer.parseInt(input)).collect(Collectors.toList());
	}

	private static void printSortedIntegers(List<Integer> integers) {
		System.out.println("Sorted:");
		for (Integer integer : integers) {
			System.out.println(integer);
		}
	}

	public static void main(String[] args) {
		List<String> inputs = readInput();
		boolean valid = isInputValid(inputs);

		if (!valid) {
			System.err.println("One of the inputs is not valid");
			return;
		}

		List<Integer> integers = mapInputsToIntegers(inputs);

		Collections.sort(integers);

		printSortedIntegers(integers);
	}

}
