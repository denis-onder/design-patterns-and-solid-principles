package designPatterns.creational.singleton;

public enum DatabaseConnector {
	INSTANCE;

	public void connect() {
		System.out.println("Connecting...");
	}

	public void disconnect() {
		System.out.println("Disconnecting...");
	}
}
