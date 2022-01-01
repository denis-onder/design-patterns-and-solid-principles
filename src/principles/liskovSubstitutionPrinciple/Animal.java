package principles.liskovSubstitutionPrinciple;

public abstract class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	protected void call() {
		String output = String.format("Come to me, %s!", name);
		System.out.println(output);
	}

	protected abstract void train();
}
