package strategydemo.concreteclass;

import strategydemo.interfaces.NavigationStrategy;

public class CarNavigation implements NavigationStrategy{

	@Override
	public void navigate() {
		System.out.println("navigate in car");
		
	}

}
