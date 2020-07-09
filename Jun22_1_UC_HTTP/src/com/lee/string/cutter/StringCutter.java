package com.lee.string.cutter;

public class StringCutter {
	public static String cut(String data) {
		data = data.replace(",", " ");
		data = data.replace("<b>", " ");
		data = data.replace("</b>", " ");
		//...
		return data;
	}
}
