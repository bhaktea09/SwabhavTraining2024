package com.techlabs.structural.adapter.test;

import com.techlabs.structural.adapter.model.Biscuit;
import com.techlabs.structural.adapter.model.Hat;
import com.techlabs.structural.adapter.model.Hatadapter;
import com.techlabs.structural.adapter.model.Iitems;
import com.techlabs.structural.adapter.model.Shoppingcart;

public class Itemtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iitems items = new Shoppingcart();
		Biscuit biscuit = new Biscuit("oreo", 123);
		Hatadapter hd = new Hatadapter();
		Shoppingcart sc = new Shoppingcart();
		Hat ht = new Hat("bhakti", "pansare", 9, 1);
		
		System.out.println(items.getItemname());
		System.out.println(biscuit.getItemprice());
		System.out.println(hd.getItemprice());
		System.out.println(ht.getShortname()+ht.getLongname()+ht.getTax()+ht.getItemprice());
		

}
}
