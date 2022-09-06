package com.aurionpro.model;

public class Example {
	private Demo demo;
	
	public Example(Demo d) {
		this.demo = d;
	}
	
	public int adding(int x, int y) {
		return demo.add(x, y);
	}
}
