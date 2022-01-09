package designPatterns.creational.builder;

public class App {

	private static void firstExample() {
		System.out.println("Only required values: ");

		Person person = new PersonBuilder("Name", "test@name.com").setAddress("Test Address").build();

		System.out.println(person.stringify());
	}

	private static void secondExample() {
		System.out.println("All values: ");

		Person person = new PersonBuilder("Name", "test@name.com").setAddress("Test Address").setCity("Test City")
				.setCountry("Test Country").setAge(40).build();

		System.out.println(person.stringify());
	}

	public static void main(String[] args) {
		firstExample();
		secondExample();
	}

}
