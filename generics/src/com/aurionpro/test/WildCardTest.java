package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.WildCard;

public class WildCardTest {

	public static void main(String[] args) {
		WildCard wildCard = new WildCard();
		List<Integer> list1 = Arrays.asList(10,20,30);
		wildCard.upperbounded(list1);
		
		System.out.println("------------");
		
		List<Float> list2 = Arrays.asList(1f,2f,3f);
		wildCard.upperbounded(list2);
		
		System.out.println("------------");
		
		wildCard.lowerbounded(list1);
//		wildCard.lowerbounded(list2);
		
		System.out.println("------------");
		
		List<String> list3 = Arrays.asList("ritz","zitr","jtipt","kat");
		wildCard.unbounded(list1);
		System.out.println("------------");
		wildCard.unbounded(list2);
		System.out.println("------------");
		wildCard.unbounded(list3);

	}

}
