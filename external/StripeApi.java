package adapter.external;

public class StripeApi {
	public void makePayment(String email, String phoneNumber) {
		System.out.println("making payment from stripeapi");
	}
	
	public StripApiStatus StripeApicheckStatus(int paymenId) {
		return StripApiStatus.ok;
	}
}
