package designPatterns.creational.factory.standardFactory;

public class App {

	public static void main(String[] args) {
		Animal cat = AnimalFactory.create(AnimalKeyType.CAT);
		Animal dog = AnimalFactory.create(AnimalKeyType.DOG);

		cat.eat();
		dog.eat();
	}

}
