package principles.dependencyInversionPrinciple;

public class App {

	public static void main(String[] args) {
		PaymentGateway gateway = new PaymentGateway(new PayPal());
		gateway.pay(5000);
	}

}
