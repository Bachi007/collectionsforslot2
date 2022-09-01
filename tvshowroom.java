package com.bankApp;

import java.util.Collections;
import java.util.LinkedList;

public class tvshowroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tv t1=new tv("OnePlus",15000,2021,4);
		tv t2=new tv("Samsung",21000,2020,5);
		tv t3=new tv("Sony",75000,2022,5);
		tv t4=new tv("LG",55000,2019,3);
		
		LinkedList <tv> ll=new LinkedList<tv>();
		ll.add(t4);
		ll.add(t3);
		ll.add(t2);
		ll.add(t1);
		System.out.println("---TVs based on price---");
		Collections.sort(ll, new tvpricecomparator());
		for(tv t:ll)
			System.out.println(t.tvCompany+" Rs. "+t.tvPrice+"only");
		
		System.out.println("---TVs based on rating---");
		Collections.sort(ll, new tvratingcomparator());
		for(tv t:ll)
			System.out.println(t.tvCompany+" Rs. "+t.tvPrice+"only");
		
		
		
	}

}
