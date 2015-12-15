package com.monopoly;

public class WrongNumberOfPlayersException extends IllegalArgumentException {
	public WrongNumberOfPlayersException(String message) {
		super(message);
	}
}
