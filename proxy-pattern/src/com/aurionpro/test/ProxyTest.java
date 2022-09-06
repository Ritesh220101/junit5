package com.aurionpro.test;

import com.aurionpro.model.IDisplay;
import com.aurionpro.model.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		IDisplay display = new Proxy();
		display.show();
		display.show();
	}
}
