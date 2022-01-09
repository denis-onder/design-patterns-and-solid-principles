package designPatterns.creational.factory.abstractFactory;

public class App {

	private static void testElectricCarInstantiation() {
		AbstractFactory factory = FactoryProducer.getFactory("ELECTRIC");

		Car teslaModelS = factory.getCar("TESLA");

		teslaModelS.assemble();
	}

	private static void testFuelCarInstantiation() {
		AbstractFactory factory = FactoryProducer.getFactory("FUEL");

		Car fordMustang = factory.getCar("FORD");

		fordMustang.assemble();
	}

	public static void main(String[] args) {
		testElectricCarInstantiation();
		testFuelCarInstantiation();
	}

}
