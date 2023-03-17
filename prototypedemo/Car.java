package prototypedemo;

public class Car extends Vehicle{

	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Car v) {
		super(v);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vehicle clone() {
		// TODO Auto-generated method stub
		return new Car(this);
	}

}
