package principles.interrfaceSegregationPrinciple;

import principles.interrfaceSegregationPrinciple.interfaces.IEmployee;

public class Employee implements IEmployee {

	@Override
	public void salary() {
		System.out.println("Employee Salary: 5000");
	}

}
