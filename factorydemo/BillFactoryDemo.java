package factorydemo;

public class BillFactoryDemo {
	public static void main(String[] args) {
		BillFactory domesticfactory =  new DomesticBillFactory();
		Plan domestic = domesticfactory.getPlan();
		domestic.getRate();
		domestic.calculateBill(10);
		
		BillFactory commercialFactory =  new CommercialBillFactory();
		Plan commercial = commercialFactory.getPlan();
		commercial.getRate();
		commercial.calculateBill(20);
		
		BillFactory institutionalFactory =  new InstitutionalBillPlanFactory();
		Plan institutional = institutionalFactory.getPlan();
		institutional.getRate();
		institutional.calculateBill(30);
	}
}
