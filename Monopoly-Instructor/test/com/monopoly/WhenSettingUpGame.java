package com.monopoly;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
		MonopolyGame game = new MonopolyGame(4);

		List<Player> players = game.getPlayers();

		assertEquals(4, players.size());
	}

	@Test(expected = WrongNumberOfPlayersException.class)
	public void shouldErrorWithTooManyPlayers() {
		new MonopolyGame(9);
	}

	@Test(expected = WrongNumberOfPlayersException.class)
	public void shouldErrorWithTooFewPlayers() {
		new MonopolyGame(1);
	}

	@Test
	public void shouldStartPlayersOnGo() {
		MonopolyGame game = new MonopolyGame(8);

		List<Square> squares = game.getSquares();
		Square goSquare = squares.get(0);
		List<Player> players = game.getPlayers();

		for (Player player : players) {
			assertEquals(goSquare, player.getLocation());
		}
	}

	@Test
	public void shouldHaveUniqueTokensForPlayers() {
		MonopolyGame game = new MonopolyGame(4);
		List<Player> players = game.getPlayers();

		assertEquals(Token.Dog, players.get(0).getToken());
		assertEquals(Token.Iron, players.get(1).getToken());
		assertEquals(Token.Shoe, players.get(2).getToken());
		assertEquals(Token.Racecar, players.get(3).getToken());
	}

	@Test
	public void shouldHaveUniqueNamesForSquares() {
		MonopolyGame game = new MonopolyGame(2);
		List<Square>	 squares = game.getSquares();

		assertEquals("Go Square", squares.get(0).getName());
		assertEquals("Square 1", squares.get(1).getName());
		assertEquals("Square 2", squares.get(2).getName());
		assertEquals("Square 3", squares.get(3).getName());
		assertEquals("Square 39", squares.get(39).getName());
	}
	
	@Test
	public void shouldStartPlayersWith1500() {
		MonopolyGame game = new MonopolyGame(8);
		List<Player> players = game.getPlayers();
		
		for (Player player : players) {
			assertEquals(1500, player.getMoney());
		}
	}
	
	
	
	
	
	
}
