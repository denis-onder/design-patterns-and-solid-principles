package designPatterns.creational.builder.badExample;

public class App {

	public static void main(String[] args) {
		User user = new User().setUsername("Username").setPassword("Password").setEmail("username@test.com");

		System.out.println("User builder");
	}

}
