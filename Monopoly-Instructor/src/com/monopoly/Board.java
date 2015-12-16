package com.monopoly;

import java.util.ArrayList;
import java.util.List;

public class Board {
	
	private List<Square> squares;

	public Board() {
		buildSquares();
		linkSquares();
	}

	private void linkSquares() {
		for (int i = 0; i < squares.size() - 1; i++) {
			Square nextSquare = squares.get(i+1);
			squares.get(i).setNextSquare(nextSquare);
		}
		
		squares.get(squares.size()-1).setNextSquare(getStartSquare());
	}

	private void buildSquares() {
		squares = new ArrayList<>();
		squares.add(new Square("Go Square"));
		for (int i = 1; i < 40; i++) {
			squares.add(new Square("Square " + i));
		}
	}

	public List<Square> getSquares() {
		return squares;
	}

	public Square getStartSquare() {
		return squares.get(0);
	}
}
