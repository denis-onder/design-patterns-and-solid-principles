package principles.dependencyInversionPrinciple;

public class Payoneer implements IPaymentMethod {

	@Override
	public void send(int amount) {
		System.out.println("Sending " + amount + " via Payoneer");
	}

}
