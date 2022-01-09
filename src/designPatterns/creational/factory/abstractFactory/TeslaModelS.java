package designPatterns.creational.factory.abstractFactory;

public class TeslaModelS implements Car {

	@Override
	public void assemble() {
		System.out.println("Assembling the Tesla Model S");
	}

}
