package principles.liskovSubstitutionPrinciple;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	protected void train() {
		System.out.println("Training " + name);
	}

}
