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
		
		for (int i = 0; i < 40; i++) {
			switch (i) {
			case 0:
				squares.add(new GoSquare());
				break;
			case 4:
				squares.add(new IncomeTaxSquare());
				break;
			case 38: 
				squares.add(new LuxuryTaxSquare());
				break;
			default:
				squares.add(new Square("Square " + i));
				break;
			}
		}
	}

	public List<Square> getSquares() {
		return squares;
	}

	public Square getStartSquare() {
		return squares.get(0);
	}
}
