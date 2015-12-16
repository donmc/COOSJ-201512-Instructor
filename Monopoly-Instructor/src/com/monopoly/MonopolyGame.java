package com.monopoly;

import java.util.ArrayList;
import java.util.List;

import com.dicegame.Die;


public class MonopolyGame {

	private Board board;
	private List<Player> players;
	private Die die1;
	private Die die2;
	
	public MonopolyGame(int numberOfPlayers) {
		
		if (numberOfPlayers > 8) throw new WrongNumberOfPlayersException("Too many!");
		if (numberOfPlayers < 2) throw new WrongNumberOfPlayersException("Too few!");
		board = new Board();
		players = new ArrayList<>();
		die1 = new Die();
		die2 = new Die();
		
		for (int i = 0; i < numberOfPlayers; i++) {
			Token token = Token.values()[i];
			players.add(new Player(token, board.getStartSquare()));
		}
		
	}
	
	public List<Square> getSquares() {
		
		return board.getSquares();
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void playRound() {
		for (Player player : players) {
			player.takeTurn(die1, die2);
		}
	}
	
	
}
