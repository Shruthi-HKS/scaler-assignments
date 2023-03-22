package strategydemo.concreteclass;

import strategydemo.interfaces.NavigationStrategy;

public class BikeNavigator implements NavigationStrategy{

	@Override
	public void navigate() {
		System.out.println("navigate in Bike");
	}

}
