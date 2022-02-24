package com.capg.jse.java8;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test8 {

	public static void main(String[] args) {

		TreeMap<Integer, String> m = new TreeMap<Integer, String>(

				(x, y) -> (x < y) ? 1 : (x > y) ? -1 : 0

		);

		m.put(100, "bunny");
		m.put(600, "dipanvi");
		m.put(200, "chinny");
		m.put(700, "vinny");
		m.put(400, "vinny");

		Set<Entry<Integer, String>> entry = m.entrySet();

		for (Entry<Integer, String> e : entry) {

			if (e.getValue().startsWith("v")) {
				System.out.println(e.getKey() + " " + e.getValue());
			}

		}

	}

}
