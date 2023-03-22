package adapter.external;

public class RazorPayApi {

	public void makePayment(String email, String phoneNumber) {
		System.out.println("making payment from razorpay");
	}
	
	public RazorPayStatus razorPayCheckStatus(int paymenId) {
		return RazorPayStatus.success;
	}
}
