package com.monopoly;

public class LotSquare extends PropertySquare {

	private int rent;

	public LotSquare(String name, int price, int rent) {
		super(name, price);
		this.rent = rent;
	}

	@Override
	public int getRent() {
		return rent;
	}

}
