package prototypedemo;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		List<Vehicle> vehiclesCopy = new ArrayList<>();
		
		Bike bike = new Bike();
		bike.color ="black";
		bike.tyres = 2;
		bike.fuel = "Petrol";
		bike.seats = 2;
		vehicles.add(bike);
		
		Car car = new Car();
		car.color ="red";
		car.tyres = 4;
		car.fuel = "Deisel";
		car.seats = 5;
		vehicles.add(car);
		
		for(Vehicle v: vehicles) {
			vehiclesCopy.add(v.clone());
		}
		
		for(Vehicle v: vehicles) {
			System.out.println("1" +v.toString());
		}
		
		for(Vehicle v: vehiclesCopy) {
			System.out.println("2" +v.toString());
		}
	}

}
