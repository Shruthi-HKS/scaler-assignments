package strategydemo;

import strategydemo.concreteclass.BikeNavigator;
import strategydemo.concreteclass.CarNavigation;

public class StrategyDemo {
	public static void main(String[] args) {
		Navigation navigation = new Navigation(new BikeNavigator());
		navigation.navigate();
		navigation = new Navigation(new CarNavigation());
		navigation.navigate();
	}

}
