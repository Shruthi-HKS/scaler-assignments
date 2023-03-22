package adapter;

import adapter.external.RazorPayApi;
import adapter.external.RazorPayStatus;
import adapter.interfaces.PaymentProvider;
import adapter.models.PaymentRequest;
import adapter.models.PaymentStatus;

public class RazorPayProvider implements PaymentProvider{

	private RazorPayApi api = new RazorPayApi();
	@Override
	public void createPayment(PaymentRequest paymentRequest) {
		api.makePayment(paymentRequest.getEmail(), paymentRequest.getPhoneNumber());
		
	}

	private PaymentStatus toStatus(RazorPayStatus status) {
		if(status == RazorPayStatus.success) {
			return PaymentStatus.success;
		}
		return PaymentStatus.error;
	}

	@Override
	public PaymentStatus verifyStatus(int paymentId) {
		
		RazorPayStatus razorPay = api.razorPayCheckStatus(paymentId);
		
		return toStatus(razorPay);
	}

}
