package adapter.interfaces;

import adapter.models.PaymentRequest;
import adapter.models.PaymentStatus;

public interface PaymentProvider {
	
	public void createPayment(PaymentRequest paymentRequest);
	public PaymentStatus verifyStatus(int paymentId);

}
