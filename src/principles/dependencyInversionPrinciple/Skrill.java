package principles.dependencyInversionPrinciple;

public class Skrill implements IPaymentMethod {

	@Override
	public void send(int amount) {
		System.out.println("Sending " + amount + " via Skrill");
	}

}
