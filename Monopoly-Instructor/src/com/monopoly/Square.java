package com.monopoly;

public class Square {

	private String name;
	private Square nextSquare;
	
	public Square(String name) {
		this.name = name;
	}

	public String getName() {
		return name; 
	}

	public Square getNextSquare() {
		return nextSquare;
	}
	
	public void setNextSquare(Square nextSquare) {
		this.nextSquare = nextSquare;
	}

	public void landOnBy(Player player) {
		
	}

	public void passOverBy(Player player) {
		
	}

}
