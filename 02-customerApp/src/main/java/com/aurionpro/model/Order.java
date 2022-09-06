package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int id;
	private String date;
	private List<LineItem> items = new ArrayList<>();

	public Order(int id, String date) {
		this.id = id;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void addLineItem(LineItem item) {
		items.add(item);
	}

	public int itemsCount() {
		return items.size();
	}

	public double calculateOrderPrice() {
		double total = 0;
		for (LineItem item : items) {
			total += item.calculateLineItemCost();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", items=" + items + "]";
	}

}
