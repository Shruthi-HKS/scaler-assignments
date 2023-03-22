package adapter;

import adapter.external.RazorPayApi;
import adapter.external.RazorPayStatus;
import adapter.external.StripApiStatus;
import adapter.external.StripeApi;
import adapter.interfaces.PaymentProvider;
import adapter.models.PaymentRequest;
import adapter.models.PaymentStatus;

public class StripeApiProvider implements PaymentProvider{

	private StripeApi api = new StripeApi();
	@Override
	public void createPayment(PaymentRequest paymentRequest) {
		api.makePayment(paymentRequest.getEmail(),paymentRequest.getPhoneNumber());
		
	}

	@Override
	public PaymentStatus verifyStatus(int paymentId) {
		
		return toStatus(api.StripeApicheckStatus(paymentId));
	}
	
	private PaymentStatus toStatus(StripApiStatus status) {
		if(status == StripApiStatus.ok) {
			return PaymentStatus.success;
		}
		return PaymentStatus.error;
	}

}
