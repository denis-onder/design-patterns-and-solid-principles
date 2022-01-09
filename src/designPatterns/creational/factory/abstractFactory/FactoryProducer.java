package designPatterns.creational.factory.abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		if (factory == "ELECTRIC") {
			return new ElectricCarFactory();
		} else if (factory == "FUEL") {
			return new FuelCarFactory();
		} else {
			return null;
		}
	}
}
