package com.bankApp;

import java.util.stream.Stream;

public class streat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int sum=0;
//		for(int i=0;i<=100;i++) {
//			
//			if(i%2==0)
//			{
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
//		
		int res=Stream.iterate(1,i->i+1).limit(100).filter(i->i%2==0).reduce(0,(i,j)->i+j);
		System.out.println(res);
		
		
		
	}

}
