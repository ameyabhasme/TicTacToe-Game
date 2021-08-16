package com.bridgelabz;

public class TicTacToeGame {

	static char board[] = new char[10];

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		init();
		createBoard();
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

}
