package designapen.models;

import designapen.strategies.RefillStrategy;
import designapen.strategies.WritingStrategy;

public abstract class Pen implements WritingStrategy{
	private String name;
	private String brand;
	private PenType type;
	private RefillStrategy strategy;
	
	
	public Pen(String name, String brand, PenType type, RefillStrategy strategy) {
		super();
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.strategy = strategy;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public PenType getType() {
		return type;
	}


	public void setType(PenType type) {
		this.type = type;
	}


	public RefillStrategy getStrategy() {
		return strategy;
	}


	public void setStrategy(RefillStrategy strategy) {
		this.strategy = strategy;
	}


	public void write() {
		this.strategy.refill(this);
	}
	
}
