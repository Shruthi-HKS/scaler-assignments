package factorydemo;

public class InstitutionalBillPlanFactory extends BillFactory{

	@Override
	public Plan getPlan() {
		// TODO Auto-generated method stub
		return new Institutional();
	}
	

}
