package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {

	static char board[] = new char[10];
	static char player, computer;
	static final Scanner SC = new Scanner(System.in);
	static int turn = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		init();
		showBoard();
		System.out.println("Board is created!");
		chooseSign();
		toss();
	}

	public static void toss() {
		int toss = (int) (Math.random() * 2);
		if (toss == 1) {
			turn = toss;
			System.out.println("Player won the toss and will play first!");
			play(turn);
		} else {
			turn = toss;
			System.out.println("Computer won the toss and will play first!");
			play(turn);
		}
	}

	public static void play(int turn) {
		while ((board[1] == ' ') || (board[2] == ' ') || (board[3] == ' ') || (board[4] == ' ') || (board[5] == ' ')
				|| (board[6] == ' ') || (board[7] == ' ') || (board[8] == ' ') || (board[9] == ' ')) {

			if (turn == 1) {
				playerMove();
				turn = 0;
			} else if (turn == 0) {
				computerMove();
				turn = 1;
			}
		}
	}

	public static void computerMove() {
		System.out.println("\nComputer Turn!");
		int move = (int) ((Math.random() * 9) + 1);
		checkAvailable(move, computer);
	}

	public static void playerMove() {
		System.out.print("\nPlayer Turn!" + "\n" + "Enter position (1-9): ");
		int move = SC.nextInt();
		checkAvailable(move, player);
	}

	public static void checkAvailable(int index, char sign) {
		if (board[index] == ' ') {
			board[index] = sign;
			showBoard();
		} else {
			System.out.println("Oops!! This position is not availabe.");
			if (sign == computer)
				computerMove();
			else
				playerMove();
		}
	}

	public static void init() {
		for (int i = 0; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public static void showBoard() {
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
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
