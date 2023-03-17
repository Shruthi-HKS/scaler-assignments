package factorydemo;

public class Commercial extends Plan{

	@Override
	public void getRate() {
		// TODO Auto-generated method stub
		rate = 20;
		System.out.println(rate);
	}

}
