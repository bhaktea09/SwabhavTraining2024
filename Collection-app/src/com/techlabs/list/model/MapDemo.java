package com.techlabs.list.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		//Map<String ,Integer> map = new HashMap<String , Integer>();
		//TreeMap<String ,Integer> map = new TreeMap<String , Integer>();
		LinkedHashMap<String ,Integer> map = new LinkedHashMap<String , Integer>();
	 map.put("D", null);
	 map.put("B", 102);
	 map.put("C", 103);
	 map.put("null", 104);
	 System.out.println(map);
	 map.putIfAbsent("A", 1000);
	 System.out.println(map);
	 
	}

}
