package com.bankApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class collectionsex2 {

	public static void main(String arhs[]) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(25);
		al.add(3);
		al.add(6);
		al.add(8);
		al.add(41);
		
		al.forEach(collectionsex2::doubleit);
		
	}
	
	public  static void doubleit(int i) {
		System.out.println(i*i);
	}
	
}
