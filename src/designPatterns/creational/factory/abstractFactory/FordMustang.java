package designPatterns.creational.factory.abstractFactory;

public class FordMustang implements Car {

	@Override
	public void assemble() {
		System.out.println("Assembling the Ford Mustang");
	}

}
