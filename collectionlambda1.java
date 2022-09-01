package com.bankApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class collectionlambda1 {

	public static void main(String args[]) {
		
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>((x1,x2)->(x1>x2)? -1:(x1<x2)?1:0);
		
		tm.put(1,"John");
		tm.put(4, "Alex");
		tm.put(3, "Doe");
		tm.put(5, "Lara");
		tm.put(2, "Alen");
		
		System.out.println(tm);
		
		
		
	}
	
	
}
