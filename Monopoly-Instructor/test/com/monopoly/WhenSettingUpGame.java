package com.monopoly;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class WhenSettingUpGame {

	@Test
	public void shouldHave40Squares() {
		// setup + exercise
		MonopolyGame game = new MonopolyGame();
		List<Square> squares = game.getSquares();
		
		// verify
		assertEquals(40, squares.size());
	}
	
	@Ignore
	@Test
	public void shouldHaveCorrectNumberOfPlayers() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void shouldErrorWithTooManyPlayers() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void shouldErrorWithTooFewPlayers() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void shouldStartPlayersOnGo() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void shouldHaveUniqueTokensForPlayers() {
		fail("Not yet implemented");		
	}

}
