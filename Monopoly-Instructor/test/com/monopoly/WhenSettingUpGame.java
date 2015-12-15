package com.monopoly;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class WhenSettingUpGame {

	@Test
	public void shouldHave40Squares() {
		// setup + exercise
		MonopolyGame game = new MonopolyGame(4);
		List<Square> squares = game.getSquares();
		
		// verify
		assertEquals(40, squares.size());
	}
	
	@Test
	public void shouldHaveCorrectNumberOfPlayers() {
		MonopolyGame game  = new MonopolyGame(4);
		
		List<Player> players = game.getPlayers();
		
		assertEquals(4, players.size());
	}
	
	@Test(expected=WrongNumberOfPlayersException.class)
	public void shouldErrorWithTooManyPlayers() {
		new MonopolyGame(9);
	}
	
	@Test(expected=WrongNumberOfPlayersException.class)
	public void shouldErrorWithTooFewPlayers() {
		new MonopolyGame(1);
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
