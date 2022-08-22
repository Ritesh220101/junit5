package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
	
	StringUtil su = new StringUtil();
	@Test
	@DisplayName("Check if only 1 A is present in first 2 place")
	void testTruncateAInFirst2Place_checkIf1AIsPresentInInFirst2Place() {
		String expected = "BCD";
		String actual = su.truncateAInFirst2Place("ABCD");
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Check if 2 A is present in first 2 place")
	void testTruncateAInFirst2Place_checkIf2AIsPresentInInFirst2Place() {
		String expected = "BCD";
		String actual = su.truncateAInFirst2Place("AABCD");
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Check if no A is present in first 2 place")
	void testTruncateAInFirst2Place_checkIfNoAIsPresentInInFirst2Place() {
		String expected = "BCD";
		String actual = su.truncateAInFirst2Place("BCD");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFirstAndLastTwoCharAreEqual() {
		boolean expected = true;
		boolean actual = su.firstAndLastTwoCharAreEqual("ABBBAB");
		assertTrue(expected==actual);
	}
}
