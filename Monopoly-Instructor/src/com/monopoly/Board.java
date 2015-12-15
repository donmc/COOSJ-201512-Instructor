package com.monopoly;

import java.util.ArrayList;
import java.util.List;

public class Board {
	
	private List<Square> squares;

	public Board() {
		squares = new ArrayList<>();
		for (int i = 0; i < 40; i++) {
			squares.add(new Square());
		}
	}

	public List<Square> getSquares() {
		return squares;
	}
}
