package com.monopoly;

public class GoSquare extends Square {

	public GoSquare() {
		super("Go Square");
	}
	 
	@Override
	public void landOnBy(Player player) {
		player.credit(200);
	}
	
	@Override
	public void passOverBy(Player player) {
		player.credit(200);
	}

}
