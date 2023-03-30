package designapen.strategies;

import designapen.models.Pen;

public class FillInk implements RefillStrategy{

	public void refill(Pen pen) {
		System.out.println("Fill Ink");
		
	}

}
