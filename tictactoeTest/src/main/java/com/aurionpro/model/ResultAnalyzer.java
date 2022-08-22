package com.aurionpro.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;
	
	public ResultAnalyzer(Board board) {
		super();
		this.board = board;
		this.result = ResultType.PROGRESS;
	}
	
	private void horizontalWinCheck() {
		
	}
	
	private void verticalWinCheck() {
		
	}
	
	private void diagonalWinCheck() {
		
	}

	public Board getBoard() {
		return board;
	}

	public ResultType getResult() {
		return result;
	}
	
	
	
}
