package prototypedemo;

public class Bike extends Vehicle{

	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(Bike v) {
		super(v);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vehicle clone() {
		// TODO Auto-generated method stub
		return new Bike(this);
	}
	

}
