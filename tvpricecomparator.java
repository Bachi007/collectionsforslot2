package com.bankApp;

import java.util.Comparator;

public class tvpricecomparator implements Comparator<tv> {

	@Override
	public int compare(tv t1, tv t2) {
		// TODO Auto-generated method stub
		if(t1.tvPrice==t2.tvPrice)
		return 0;
		if(t1.tvPrice>t2.tvPrice)
		return 1;
		else
		return -1;
	}

	
	
}
