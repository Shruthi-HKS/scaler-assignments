package strategydemo;

import strategydemo.interfaces.NavigationStrategy;

public class Navigation {

	private NavigationStrategy strategy;

	public Navigation(NavigationStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	
	public void navigate() {
		this.strategy.navigate();
	}
	
}
