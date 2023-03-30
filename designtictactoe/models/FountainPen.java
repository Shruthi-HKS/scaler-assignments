package designapen.models;

import designapen.strategies.RefillStrategy;

public class FountainPen extends Pen{

	private Ink ink;
	private Nib nib;


	public FountainPen(String name, String brand, PenType type, RefillStrategy strategy, Ink ink, Nib nib) {
		super(name, brand, type, strategy);
		this.ink = ink;
		this.nib = nib;
	}


	public Ink getInk() {
		return ink;
	}


	public void setInk(Ink ink) {
		this.ink = ink;
	}


	public Nib getNib() {
		return nib;
	}


	public void setNib(Nib nib) {
		this.nib = nib;
	}
	

}
