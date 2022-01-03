package principles.dependencyInversionPrinciple;

public class PayPal implements IPaymentMethod {

	@Override
	public void send(int amount) {
		System.out.println("Sending " + amount + " via PayPal");
	}

}
