package com.monopoly;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class WhenLandingOrPassingMoneySquares {

	@Test
	public void shouldCollect200ForLandingOnGo() {
		Board board = new Board();
		Player testPlayer = new Player(Token.Battleship, board.getSquares().get(36));
		
		testPlayer.takeTurn(new LoadedDie(1), new LoadedDie(3));
		
		assertEquals(1700, testPlayer.getMoney());
	}
	
	@Test
	public void shouldPay75ForLandingOnLuxuryTax() {
		Board board = new Board();
		Player testPlayer = new Player(Token.Battleship, board.getSquares().get(35));
		
		testPlayer.takeTurn(new LoadedDie(1), new LoadedDie(2));
		
		assertEquals(1425, testPlayer.getMoney());
	}
	
	@Test
	public void shouldPay10PercentForLandingOnIncomeTaxIfPoor() {
		Board board = new Board();
		Player testPlayer = new Player(Token.Battleship, board.getStartSquare());
		
		testPlayer.takeTurn(new LoadedDie(1), new LoadedDie(3));
		
		assertEquals(1350, testPlayer.getMoney());
	}
	
	@Test
	public void shouldPay200ForLandingOnIncomeTaxIfRich() {
		Board board = new Board();
		Player testPlayer = new Player(Token.Battleship, board.getStartSquare());
		testPlayer.credit(1500);
		
		testPlayer.takeTurn(new LoadedDie(1), new LoadedDie(3));
		
		assertEquals(2800, testPlayer.getMoney());
	}
	
	@Test
	public void shouldCollect200ForPassingGo() {
		Board board = new Board();
		Player testPlayer = new Player(Token.Battleship, board.getSquares().get(36));
		
		testPlayer.takeTurn(new LoadedDie(2), new LoadedDie(4));
		
		assertEquals(1700, testPlayer.getMoney());
	}
}
