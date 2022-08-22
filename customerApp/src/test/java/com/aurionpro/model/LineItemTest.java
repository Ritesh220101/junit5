package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineItemTest {
	Product product1 = new Product(1, "pepsi", 100, 0.1f);
	LineItem lineItem1 = new LineItem(1, 2, product1);
	
	@Test
	void testCalculateLineItemCost() {
		double expected = 180;
		double actual = Math.ceil(lineItem1.calculateLineItemCost());
		assertEquals(expected, actual);
	}
}	
