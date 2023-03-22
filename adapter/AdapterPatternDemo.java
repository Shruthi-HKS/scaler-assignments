package adapter;

import adapter.interfaces.PaymentProvider;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		PaymentProvider provider = new RazorPayProvider();
		System.out.println(provider.verifyStatus(10));
		
		PaymentProvider provider1 = new StripeApiProvider();
		System.out.println(provider1.verifyStatus(10));
	}
}
