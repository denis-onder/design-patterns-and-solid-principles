package principles.interrfaceSegregationPrinciple;

import principles.interrfaceSegregationPrinciple.interfaces.IChiefExecutiveOfficer;
import principles.interrfaceSegregationPrinciple.interfaces.IEmployee;
import principles.interrfaceSegregationPrinciple.interfaces.IManager;

public class App {
	private static void testEmployee() {
		IEmployee employee = new Employee();

		employee.salary();
	}

	private static void testManager() {
		IManager manager = new Manager();

		manager.salary();
		manager.addBonus();
		manager.hire();
		manager.train();
	}

	private static void testCEO() {
		IChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();

		ceo.salary();
		ceo.addBonus();
		ceo.addStocks();
		ceo.makeDecisions();
	}

	public static void main(String[] args) {
		System.out.println("Interface segregation principle");

		testEmployee();
		testManager();
		testCEO();
	}
}
