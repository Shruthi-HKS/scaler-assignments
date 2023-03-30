package designapen.models;

import designapen.strategies.RefillStrategy;

public class GelPen extends Pen{

	public GelPen(String name, String brand, PenType type, RefillStrategy strategy) {
		super(name, brand, type, strategy);
		// TODO Auto-generated constructor stub
	}

	private Refill refill;
	

}
