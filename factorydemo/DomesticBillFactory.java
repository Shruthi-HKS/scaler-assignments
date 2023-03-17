package factorydemo;

public class DomesticBillFactory extends BillFactory{

	@Override
	public Plan getPlan() {
		// TODO Auto-generated method stub
		return new Domestic();
	}

}
