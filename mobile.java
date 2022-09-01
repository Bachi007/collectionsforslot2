package com.bankApp;

public class mobile implements Comparable<mobile> {

	String mobileCompany;
	String mobileModel;
	int mobilePrice;
	int mobileRam;
	public mobile(String mobileCompany, String mobileModel, int mobilePrice, int mobileRam) {
		
		this.mobileCompany = mobileCompany;
		this.mobileModel = mobileModel;
		this.mobilePrice = mobilePrice;
		this.mobileRam = mobileRam;
	}
	@Override
	public int compareTo(mobile m1) {
		// TODO Auto-generated method stub
		if(this.mobilePrice==m1.mobilePrice)
		return 0;
		if(this.mobilePrice>m1.mobilePrice)
		return 1;
		else
		return -1;
	}
	
	
	
	
}
