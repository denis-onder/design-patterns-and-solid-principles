package principles.liskovSubstitutionPrinciple;

public class App {
	public static void main(String[] args) {
		Animal animal = new Cat("Minnie");
		animal.call();
		animal.train();
	}
}
