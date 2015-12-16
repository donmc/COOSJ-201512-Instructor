package com.monopoly;

public class LuxuryTaxSquare extends Square {

	public LuxuryTaxSquare() {
		super("Luxury Tax Square");
	}
	
	@Override
	public void landOnBy(Player player) {
		player.debit(75);
	}
 
}
