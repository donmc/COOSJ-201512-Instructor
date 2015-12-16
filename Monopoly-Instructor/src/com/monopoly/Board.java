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
			case  1: case  3: case  6: case  8: case  9:
			case 11: case 13: case 14: case 16: case 18: case 19:
			case 21: case 23: case 24: case 26: case 27: case 29:
			case 31: case 32: case 34: case 37: case 39:
				squares.add(new LotSquare("Lot Square " + i, (i+1)*10, i));
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
