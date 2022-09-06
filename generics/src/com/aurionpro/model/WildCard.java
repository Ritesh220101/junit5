package com.aurionpro.model;

import java.util.List;

public class WildCard {
	//upperbounded
	public void upperbounded(List<? extends Number> list) {
		System.out.println("Printing from upperbounded wildcard");
		for(Object o:list)
			System.out.println(o);
	}
	
	//lowerbounded
	public void lowerbounded(List<? super Integer> list) {
		System.out.println("Printing from lowerbounded wildcard");
		for(Object o:list)
			System.out.println(o);
	}
	
	//unbounded
	public void unbounded(List<?> list) {
		System.out.println("Printing from unbounded wildcard");
		for(Object o:list)
			System.out.println(o);
	}
}
