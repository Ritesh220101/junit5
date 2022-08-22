package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductTest {
	Product product1 = new Product(1, "pepsi", 100, 0.1f);
	
	@Test
	void testCalculatePriceAfterDiscount() {
		double expected = 90;
		double actual = Math.ceil(product1.calculatePriceAfterDiscount());
		assertEquals(expected, actual);
	}
}
