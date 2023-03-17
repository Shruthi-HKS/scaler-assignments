package factorydemo;

public class CommercialBillFactory extends BillFactory{

	@Override
	public Plan getPlan() {
		// TODO Auto-generated method stub
		return new Commercial();
	}

}
