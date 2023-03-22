package strategydemo.concreteclass;

import strategydemo.interfaces.NavigationStrategy;

public class FootNavigator implements NavigationStrategy{

	@Override
	public void navigate() {
		System.out.println("navigate in Foot");
	}

}
