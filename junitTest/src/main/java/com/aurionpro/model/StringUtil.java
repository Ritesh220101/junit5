package com.aurionpro.model;

public class StringUtil {
	public String truncateAInFirst2Place(String str) {
		str = str.toUpperCase();
		String temp = "";
		if (str.charAt(0) == 'A' && str.charAt(1) == 'A')
			temp = str.substring(2);
		else if (str.charAt(0) == 'A')
			temp = str.substring(1);
		else if (str.charAt(1) == 'A')
			temp = str.charAt(0) + str.substring(2);
		else
			temp = str;
		return temp;
	}

	public boolean firstAndLastTwoCharAreEqual(String str) {
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		str1.append(str.charAt(0));
		str1.append(str.charAt(1));
		str2.append(str.charAt(str.length() - 2));
		str2.append(str.charAt(str.length() - 1));
		if (str1.toString().equals(str2.toString()))
			return true;
		return false;
	}
}
