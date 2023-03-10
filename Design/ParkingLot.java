package Design;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
	List<CompactSpot> compactSpotList = new ArrayList<CompactSpot>();
	List<LargeSpot> largeSpotList = new ArrayList<LargeSpot>();
	List<BikeSpot> bikeSpotList = new ArrayList<BikeSpot>();
	
	int freeCompactSpots;
	int freeLargeSpots;
	int freeBikeSpots;
	
	public ParkingLot(int freeCompactSpots,int freeLargeSpots,int freeBikeSpots) {
		this.freeCompactSpots = freeCompactSpots;
		this.freeLargeSpots = freeLargeSpots;
		this.freeBikeSpots = freeBikeSpots;
	}
	
	//Park Vehicle
	public void parkVehichle(Vehicle vehicle) {
		System.out.println("you are about to park your vehichle");
		if(vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
			if(freeLargeSpots > 0)
				parkYourLargeVehichle(vehicle);
			else
				System.out.println("Sorry All large spots are full");
			
		}else if(vehicle.getVehicleType().equals(VehicleType.CAR)) {
			if(freeCompactSpots > 0 )
				parkYourCompactVehichle(vehicle);
			else if(freeLargeSpots > 0)
				parkYourLargeVehichle(vehicle);
			else
				System.out.println("Sorry All compact and large spots are full");
			
		}else if(vehicle.getVehicleType().equals(VehicleType.BIKE)) {
			if(freeBikeSpots > 0 )
				parkYourBike(vehicle);
			else if(freeCompactSpots > 0)
				parkYourCompactVehichle(vehicle);
			else if(freeLargeSpots > 0)
				parkYourLargeVehichle(vehicle);
			else
				System.out.println("No space available");
		}
	}

	private void parkYourLargeVehichle(Vehicle vehicle) {
		LargeSpot largeSpot = new LargeSpot(ParkingSpotType.LARGE);
		largeSpot.setFree(false);
		largeSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(largeSpot);
		
		largeSpotList.add(largeSpot);
		System.out.println("Your large vehichle is successfully parked");
		freeLargeSpots--;
		
		
	}
	
	private void parkYourCompactVehichle(Vehicle vehicle) {
		CompactSpot compactSpot = new CompactSpot(ParkingSpotType.COMPACT);
		compactSpot.setFree(false);
		compactSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(compactSpot);
		
		compactSpotList.add(compactSpot);
		System.out.println("Your compact vehichle is successfully parked");
		freeCompactSpots--;
		
		
	}
	
	private void parkYourBike(Vehicle vehicle) {
		BikeSpot bikeSpot = new BikeSpot(ParkingSpotType.BIKE);
		bikeSpot.setFree(false);
		bikeSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(bikeSpot);
		
		bikeSpotList.add(bikeSpot);
		System.out.println("Your Bikr is successfully parked");
		freeBikeSpots--;
		
		
		
	}
	
	//unpark vehicle
	
	public void unParkVehichle(Vehicle vehicle) {
		System.out.println("you are about to unpark your vehichle");
		ParkingSpot parkingSpot = vehicle.getParkingSpot();
		parkingSpot.setFree(true);
		if(vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
			if(largeSpotList.remove(vehicle)) {
				System.out.println("you have successfully removed your vehicle");
				freeLargeSpots++;
			}				
			else
				System.out.println("You dont have your vehichle parked at this spot");
			
		}else if(vehicle.getVehicleType().equals(VehicleType.CAR)) {
			if(compactSpotList.remove(vehicle)) {
				System.out.println("you have successfully removed your vehicle");
				freeCompactSpots++;
			}				
			else
				System.out.println("You dont have your vehichle parked at this spot");
			
		}else if(vehicle.getVehicleType().equals(VehicleType.BIKE)) {
			if(bikeSpotList.remove(vehicle)) {
				System.out.println("you have successfully removed your vehicle");
				freeBikeSpots++;
			}				
			else
				System.out.println("You dont have your vehichle parked at this spot");
		}
	}
}
