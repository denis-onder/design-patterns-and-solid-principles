package principles.interrfaceSegregationPrinciple;

import principles.interrfaceSegregationPrinciple.interfaces.IManager;

public class Manager implements IManager {

	@Override
	public void salary() {
		System.out.println("Manager salary: 8000");
	}

	@Override
	public void addBonus() {
		System.out.println("Adding 1000 as a bonus to all employees");

	}

	@Override
	public void hire() {
		System.out.println("Hiring new employees");
	}

	@Override
	public void train() {
		System.out.println("Training new employees");
	}
}
