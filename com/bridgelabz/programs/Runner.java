package com.bridgelabz.programs;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
		Players[] players = new Players[4];
		for (int i = 0; i < players.length; i++) {
			System.out.println("Enter Player Name: ");
			players[i] = new Players(input.nextLine());
		}
	}

}
