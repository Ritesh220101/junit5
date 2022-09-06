package com.aurionpro.model;

import java.util.List;

public class Customer {
	private OrderPrice orderPrice;
	private List<Order> orders;

	public OrderPrice getPrice() {
		return orderPrice;
	}

	public void setPrice(OrderPrice orderPrice) {
		this.orderPrice = orderPrice;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public double totalOrderPrice() {
		double total = 0;
		for(Order o:orders) {
			total+= orderPrice.getPrice(o)*o.getQuantity();
		}
		return total;
	}
}
