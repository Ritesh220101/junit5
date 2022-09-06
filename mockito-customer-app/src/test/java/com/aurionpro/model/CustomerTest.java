package com.aurionpro.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
	Customer customer;
	OrderPrice orderPrice;

	@BeforeEach
	public void create() {
		customer = new Customer();
		orderPrice = mock(OrderPrice.class);
		customer.setPrice(orderPrice);
	}
	
	@Test
	public void testTotalPrice() {
		List<Order> orders = new ArrayList<>();
		Order order1 = new Order(1, "oil", 5);
		Order order2 = new Order(2, "sugar", 2);
		Order order3 = new Order(3, "cheese", 10);
		
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		
		customer.setOrders(orders);
		
		when(orderPrice.getPrice(order1)).thenReturn(200.0);
		when(orderPrice.getPrice(order2)).thenReturn(100.0);
		when(orderPrice.getPrice(order3)).thenReturn(25.0);
		
		assertEquals(1450,customer.totalOrderPrice());
	}
}
