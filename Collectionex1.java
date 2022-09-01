package com.bankApp;
import java.util.*;
public class Collectionex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> al=new LinkedList<String>();
		
		al.add("Mango");
		al.add("Kiwi");
		al.add("Banana");
		al.add("Orange");
		al.add("Mango");
		al.add("Mango");
		al.add("Mango");
		
		al.set(2, "Apple");
		LinkedList <String> all = new LinkedList<String>();
		all.add("Grapes");
		all.add("Berries");
		
		al.addAll(all);
		
		Collections.sort(al,Collections.reverseOrder());
		
		Iterator it=al.iterator();
		while(it.hasNext())
		System.out.println("Hi "+it.next());		
		
	
	
	}
	

}
