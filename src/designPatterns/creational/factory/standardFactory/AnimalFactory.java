package designPatterns.creational.factory.standardFactory;

public class AnimalFactory {

	public static Animal create(AnimalKeyType type) {
		switch (type) {
		case CAT: {
			return new Cat();
		}
		case DOG: {
			return new Dog();
		}
		default:
			return null;
		}
	}

}
