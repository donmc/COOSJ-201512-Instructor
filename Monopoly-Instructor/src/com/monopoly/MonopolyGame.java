package com.monopoly;

import java.util.ArrayList;
import java.util.List;


public class MonopolyGame {

	private Board board;
	private List<Player> players;
	
	
	public MonopolyGame(int numberOfPlayers) {
		
		if (numberOfPlayers > 8) throw new WrongNumberOfPlayersException("Too many!");
		if (numberOfPlayers < 2) throw new WrongNumberOfPlayersException("Too few!");
		board = new Board();
		players = new ArrayList<>();
		
		for (int i = 0; i < numberOfPlayers; i++) {
			players.add(new Player());
		}
		
	}
	
	public List<Square> getSquares() {
		
		return board.getSquares();
	}

	public List<Player> getPlayers() {
		return players;
	}
	
	
}
