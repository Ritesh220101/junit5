package com.aurionpro.test;

import com.aurionpro.model.Generic;

public class GenericTest {

	public static void main(String[] args) {
		Generic<Integer> integer = new Generic<>();
		integer.display(10);
		System.out.println(integer.getT());
		
		Generic<Double> dou = new Generic<>();
		dou.display(10.0);
		System.out.println(dou.getT());
		
		Generic<Float> flo = new Generic<>();
		flo.display(0.001f);
		System.out.println(flo.getT());
		
		Generic<String> str = new Generic<>();
		str.display("ritz");
		System.out.println(str.getT());
	}

}
