package com.aurionpro.model;

public class Proxy implements IDisplay {
	private Implementation implementation;

	@Override
	public void show() {
		if (implementation == null) {
			System.out.println("Creating object....");
			implementation = new Implementation();
		}
		implementation.show();
	}

}
