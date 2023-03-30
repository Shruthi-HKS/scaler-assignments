package designapen.strategies;

import designapen.models.Pen;

public class Refillable implements RefillStrategy{

	@Override
	public void refill(Pen pen) {
		System.out.println("Change Refill");
		
	}

}
