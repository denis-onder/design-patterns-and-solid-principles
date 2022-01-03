package principles.dependencyInversionPrinciple;

public class PaymentGateway {
	private IPaymentMethod paymentMethod;

	public PaymentGateway(IPaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void pay(int amount) {
		this.paymentMethod.send(amount);
	}
}
