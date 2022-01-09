package designPatterns.creational.factory.abstractFactory;

public class ElectricCarFactory implements AbstractFactory {

	@Override
	public Car getCar(String type) {
		if (type == "TESLA") {
			return new TeslaModelS();
		}

		return null;
	}

}
