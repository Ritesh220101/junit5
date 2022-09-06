package com.aurionpro.model;

import java.util.List;

public class Generic<T> {
	private T t;

	public void display(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
	
	
}
