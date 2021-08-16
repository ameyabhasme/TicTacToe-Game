package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {

	static char board[] = new char[10];
	static char player, computer;
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		init();
		createBoard();
		chooseSign();
	}

	public static void init() {
		for (int i = 0; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public static void createBoard() {
		System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
		System.out.println("---------");
		System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
		System.out.println("---------");
		System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
		System.out.println("Board is created!");
	}
	
	public static void chooseSign() {
		while (player != 'X' && player != 'O') {
			System.out.print("Choose a sign between 'X' and 'O': ");
			char userChoice = SC.next().charAt(0);
			if (userChoice == 'O' || userChoice == 'o') {
				player = 'O';
				computer = 'X';
			} else if (userChoice == 'X' || userChoice == 'x') {
				player = 'X';
				computer = 'O';
			} else
				System.out.println("Invalid choice!");
		}
		System.out.println("Player sign: " + player + "\n" + "Comouter sign: " + computer);
	}
}
