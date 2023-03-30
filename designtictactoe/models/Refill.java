package designapen.models;

public class Refill {
	private Double radius;
	private Boolean refillable;
	private RefillType refillType;
	private Ink ink;
	private Nib nib;
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	public Boolean getRefillable() {
		return refillable;
	}
	public void setRefillable(Boolean refillable) {
		this.refillable = refillable;
	}
	public RefillType getRefillType() {
		return refillType;
	}
	public void setRefillType(RefillType refillType) {
		this.refillType = refillType;
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
