package com.bankApp;

import java.util.ArrayList;

public class library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b1=new book(50,"Hrad first Java",1234);
		book b2=new book(30,"Angular Java",1235);		
		
		ArrayList <book> al=new ArrayList<book>();
		al.add(b1);
		al.add(b2);
		
		for(book i:al)
		System.out.println(i.bookNum+" is "+i.bookName+" and the price is :"+i.price);
		
	}

}
class book{
	int price;
	String bookName;
	int bookNum;
	public book(int price, String bookName, int bookNum) {
		
		this.price = price;
		this.bookName = bookName;
		this.bookNum = bookNum;
	}
	
}
