package com.bankApp;

import java.util.Collections;
import java.util.LinkedList;

public class mobileshowroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mobile m1=new mobile("OnePlus","9RT",42000,8);
		mobile m2=new mobile("POCO","X4 pro",19000,6);
		mobile m3=new mobile("Samsung","Galaxy m31",16000,5);
		mobile m4=new mobile("Pixel","6pro",65000,8);
		
		LinkedList <mobile> ll=new LinkedList<mobile> ();
		ll.add(m4);
		ll.add(m3);
		ll.add(m2);
		ll.add(m1);
		Collections.sort(ll);
		System.out.println("mobiles based on price");
		for(mobile m:ll)
		System.out.println(m.mobileCompany+"->"+m.mobileModel);
		
	}

}
