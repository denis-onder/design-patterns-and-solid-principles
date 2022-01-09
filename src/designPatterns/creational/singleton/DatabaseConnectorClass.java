package designPatterns.creational.singleton;

public class DatabaseConnectorClass {

	private static DatabaseConnectorClass INSTANCE;

	public static DatabaseConnectorClass getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DatabaseConnectorClass();
		}

		return INSTANCE;
	}

	private DatabaseConnectorClass() {
	}

	public void connect() {
		System.out.println("Connecting...");
	}

	public void disconnect() {
		System.out.println("Disconnecting...");
	}
}
