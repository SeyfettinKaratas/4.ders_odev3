package entities.concretes;

import entities.abstracts.Entity;

public class Discount implements Entity{
	
	private int id;
	private String discountName;
	private String info;
	private double discountRate;
	
	public Discount () {}

	public Discount(int id, String discountName, String info, double discountRate) {
		super();
		this.id = id;
		this.discountName = discountName;
		this.info = info;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
}
