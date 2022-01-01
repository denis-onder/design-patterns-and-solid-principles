package principles.liskovSubstitutionPrinciple;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	protected void train() {
		System.out.println("Good luck training a cat...");
	}

}
