package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilTest {
	MathUtil mu;

	@Disabled
	@Test
	void test() {
		System.out.println("Hello world!");
		fail("This test failed!!");
	}

	@BeforeAll
	void beforeAll() {
		System.out.println("Printing before all...");
	}

	@BeforeEach
	void beforeEach() {
		mu = new MathUtil();
		System.out.println("Printing before each...");
	}

	@Test
	@DisplayName("Check addition of positive integers")
	void testAddNumber_checkPositiveInteger() {// method name should start by test then the method name
		int expected = 10;
		int actual = mu.addNumber(5, 5);
		assertEquals(expected, actual);
	}

	@Test
	void testAddNumber_checkPositiveIntegerAndZero() {
		int expected = 5;
		int actual = mu.addNumber(5, 0);
		assertEquals(expected, actual);
	}

	@Test
	void testAddNumber_checkNegativeInteger() {
		int expected = -10;
		int actual = mu.addNumber(-5, -5);
		assertEquals(expected, actual);
	}

	@Test
	void testDivideNumber_checkDivisionByPositiveIntegers() {
		int expected = 2;
		int actual = mu.divideNumber(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	void testDivideNumber_checkDivisionByNegativeIntegers() {
		int expected = -2;
		int actual = mu.divideNumber(10, -5);
//		assertEquals(expected, actual);
		assertTrue(expected == actual);
	}

	
//	@Test
//	void testDivideNumber_checkDivisionByZero() {
//		int expected = 0;
//		int actual = mu.divideNumber(0, 0);
//		assertEquals(expected, actual);
//	}

	@Test
	void testDivideNumber_checkArithmeticException() {
		assertThrows(ArithmeticException.class, () -> {
			mu.divideNumber(10, 0);
		});
	}
	
	@Test
	void testEqualArrays() {
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		assertArrayEquals(a, b);
	}
}
