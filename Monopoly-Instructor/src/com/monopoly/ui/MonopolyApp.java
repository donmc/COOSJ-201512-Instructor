package com.monopoly.ui;

import java.util.List;

import com.monopoly.MonopolyGame;
import com.monopoly.Player;

public class MonopolyApp {

	public static void main(String[] args) {
		MonopolyGame game = new MonopolyGame(2);
		List<Player> players = game.getPlayers();

		for (int i = 0; i < 10; i++) {
			game.playRound();
			for (Player player : players) {
				System.out.println(player.getToken() + " rolled a " + player.getLastRoll());
				System.out.println(player.getToken() + " land on " + player.getLocation().getName());
				System.out.println(player.getToken() + " has $" + player.getMoney());
			}
			System.out.println("-----------------------");
		}

	}

}
