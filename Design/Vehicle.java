package Design;

public class Vehicle {
	
	private int vehichleNumber;
	private VehicleType vehicleType;
	private ParkingSpot parkingSpot;
	
	Vehicle(VehicleType vehicleType){
		this.vehicleType = vehicleType;
	}
	public int getVehichleNumber() {
		return vehichleNumber;
	}
	public void setVehichleNumber(int vehichleNumber) {
		this.vehichleNumber = vehichleNumber;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}
	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	
	
	

}
