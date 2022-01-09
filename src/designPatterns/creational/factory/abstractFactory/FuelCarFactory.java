package designPatterns.creational.factory.abstractFactory;

public class FuelCarFactory implements AbstractFactory {

	@Override
	public Car getCar(String type) {
		if (type == "FORD") {
			return new FordMustang();
		}

		return null;
	}

}
