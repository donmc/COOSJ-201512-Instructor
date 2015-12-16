package com.monopoly;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class WhenLandingOnPropertySquares {

	@Test
	public void shouldPurchaseUnownedAndAffordableProperty() {
		Board board = new Board();
		Player visitor = new Player(Token.Iron, board.getStartSquare());
		PropertySquare property = (PropertySquare)board.getSquares().get(9);
		visitor.takeTurn(new LoadedDie(5), new LoadedDie(4));
		
		assertEquals(1400, visitor.getMoney());
		assertEquals(visitor, property.getOwner());		

	}
	
	@Ignore 
	@Test
	public void shouldNotPurchaseOwnedProperty() {
		fail("Not yet implemented");
	}
	
	@Ignore 
	@Test
	public void shouldNotPurchaseUnaffordableProperty() {
		fail("Not yet implemented");
	}
	
	@Ignore 
	@Test
	public void shouldPayRentForOwnedLot() {
		fail("Not yet implemented");
	}
	
	@Ignore 
	@Test
	public void shouldPayRentForOwnedRailroad() {
		fail("Not yet implemented");
	}

	@Ignore 
	@Test
	public void shouldPayRentForOwnedUtility() {
		fail("Not yet implemented");
	}
}
