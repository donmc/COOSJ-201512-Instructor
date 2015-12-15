package com.monopoly;

import java.util.ArrayList;
import java.util.List;


public class MonopolyGame {

	private Board board;
	
	
	public MonopolyGame() {
		board = new Board();
	}
	
	public List<Square> getSquares() {
		
		return board.getSquares();
	}
	
	
}
