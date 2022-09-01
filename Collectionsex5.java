package com.bankApp;

import java.util.HashMap;
import java.util.TreeMap;

public class Collectionsex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <Integer,String> hm=new TreeMap<Integer,String>();

		hm.put(102, "John");
		hm.put(101, "Bhaskar");
		hm.put(104, "Alex");
		hm.put(103,"Doe");
		hm.put(101, "Carey");
		hm.forEach((rollNum,StudentName)->{
			System.out.println(rollNum+" ->"+StudentName);
		});
	}

}
