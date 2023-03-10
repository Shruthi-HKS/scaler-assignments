package Design;

public class MainClient {

	public static void main(String[] args) {
		ParkingLot parkingLot = new ParkingLot(2, 2, 2);
		
		Vehicle vehicle = new Vehicle(VehicleType.TRUCK);
		parkingLot.parkVehichle(vehicle);
		parkingLot.unParkVehichle(vehicle);
	}
}
