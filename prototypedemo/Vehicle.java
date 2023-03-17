package prototypedemo;

public abstract class Vehicle {
	protected int seats;
	protected int tyres;
	protected String fuel;
	protected String color;
	
	public Vehicle() {
		
	}
	
	public Vehicle(Vehicle v) {
		if(v != null) {
			this.seats = v.seats;
			this.tyres = v.tyres;
			this.fuel = v.fuel;
			this.color = v.color;
		}
		
	}
	
	public abstract Vehicle clone();

	@Override
	public String toString() {
		return "Vehicle [seats=" + seats + ", tyres=" + tyres + ", fuel=" + fuel + ", color=" + color + "]";
	}
	
	

}
