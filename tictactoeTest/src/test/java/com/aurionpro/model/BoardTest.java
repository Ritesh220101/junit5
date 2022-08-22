package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {

	Board board;

	@BeforeEach
	void creatingBoard() {
		board = new Board();
	}

	@Test
	void testCreateBoard_allNineCellsAreEmpty() {
		boolean expected = false;
		boolean actual = board.isBoardFull();
		assertEquals(expected, actual);
	}

	@Test
	void testSetCellMark_ableToMarkAtSpecificLocation() {
		Board board1 = new Board();
		board1.setCellMark(0, MarkType.X);
		Cell[] expected = board1.getCells();
		
		board.setCellMark(0, MarkType.X);
		Cell[] actual = board.getCells();

		 assertArrayEquals(expected, actual);
	}

	@Test
	void testSetCellMark_throwsInvalidLocationExceptionForInvalidCellLocation() {
		
		assertThrows(InvalidCellLocation.class, ()->{
			board.setCellMark(20, MarkType.X);
		});
	}

	@Test
	void testIsBoardFull_checkTrueIfBoardIsFull() {
		boolean expected = true;
		for(int i=0;i<9;i++) {
			board.setCellMark(i, MarkType.X);
		}
		boolean actual = board.isBoardFull();
		assertEquals(expected, actual);
	}

	@Test
	void testSetCellMark_throwsCellAlreadyMarkedExceptionIfCellMarkedTwice() {
		board.setCellMark(0, MarkType.O);
		assertThrows(CellAlreadyMarkException.class, ()->{
			board.setCellMark(0, MarkType.X);
		});
	}

}
