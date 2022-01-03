package principles.interrfaceSegregationPrinciple;

import principles.interrfaceSegregationPrinciple.interfaces.IChiefExecutiveOfficer;

public class ChiefExecutiveOfficer implements IChiefExecutiveOfficer {

	@Override
	public void salary() {
		System.out.println("CEO salary: 10000");
	}

	@Override
	public void addBonus() {
		System.out.println("Adding 2000 as a bonus to all employees and managers");
	}

	@Override
	public void makeDecisions() {
		System.out.println("Making a decision.");
	}

	@Override
	public void addStocks() {
		System.out.println("Adding stocks to all employees as equity.");
	}

}
