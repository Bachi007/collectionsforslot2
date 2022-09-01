package com.bankApp;
import java.util.*;
import java.util.stream.Collectors;
public class streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> val=Arrays.asList(15,20,6,9,8,2,16);
		
		val.forEach(streamapi::doubleit);
		
		//		List<Integer> res=val.stream()
//								.sorted()
//								.collect(Collectors.toList());
//		System.out.println(res);
	}
	public static void doubleit(int x) {
		System.out.println(x*x);
	}

}
