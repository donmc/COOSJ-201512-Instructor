package com.monopoly;

public abstract class PropertySquare extends Square {

	private int price;
	private Player owner;

	public PropertySquare(String name, int price) {
		super(name);
		this.price = price;
	}
	 
	@Override
	public void landOnBy(Player player) {
		player.debit(price);
		this.owner = player;
	}

	public Player getOwner() {
		return owner;
	}
	
	public abstract int getRent();

}
