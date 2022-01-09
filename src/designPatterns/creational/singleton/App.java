package designPatterns.creational.singleton;

public class App {

	private static void enumsSingletonImplementation() {
		DatabaseConnector firstConnector = DatabaseConnector.INSTANCE;
		DatabaseConnector secondConnector = DatabaseConnector.INSTANCE;

		firstConnector.connect();
		secondConnector.connect();

		firstConnector.disconnect();
		secondConnector.disconnect();

		if (firstConnector == secondConnector) {
			System.out.println("Both connectors are the same, meaning that enums are thread safe.");
			System.out.println("Enums are compile-time constants, meaning that they do not change over-time.");
		}
	}

	private static void classSingletonImplementation() {
		DatabaseConnectorClass firstConnector = DatabaseConnectorClass.getInstance();
		DatabaseConnectorClass secondConnector = DatabaseConnectorClass.getInstance();

		firstConnector.connect();
		secondConnector.connect();

		firstConnector.disconnect();
		secondConnector.disconnect();

		if (firstConnector == secondConnector) {
			System.out.println("Both instances are the same.");
			System.out.println("This is not a thread safe solution, hence why enums/synchronization should be used.");
		}
	}

	public static void main(String[] args) {
		enumsSingletonImplementation();
		classSingletonImplementation();
	}

}
