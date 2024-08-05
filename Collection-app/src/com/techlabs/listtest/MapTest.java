package com.techlabs.listtest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "shweta");
		map.put(2, "mitali");
		map.put(3, "bhakti");
		map.put(4, "vedika");
		
		Set<Entry<Integer , String>> entries = map.entrySet();
		for (Entry<Integer , String> entry : entries)
			System.out.println(entry.getKey()+entry.getValue());
	
	}

}
