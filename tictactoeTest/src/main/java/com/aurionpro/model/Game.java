package com.aurionpro.model;

public class Game {
	private Player currentPlayer;
	private Player[] players;
	private Board board;
	private ResultAnalyzer analyzer;
	ResultType result = ResultType.PROGRESS;
	
	public Game(Player[] players, Board board, ResultAnalyzer analyzer, ResultType result) {
		super();
		this.currentPlayer = players[0];
		this.players = players;
		this.board = board;
		this.analyzer = analyzer;
		this.result = result;
	}
	
	public void play() {
		
	}
	
	private void switchCurrentPlayer() {
		if(currentPlayer== players[0])
			currentPlayer = players[1];
		currentPlayer = players[0];
	}
	
	public Player getCurrentPlayer() {
		return this.currentPlayer;
	}
}
