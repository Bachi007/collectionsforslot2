package com.bankApp;

import java.util.Comparator;

public class tvratingcomparator implements Comparator<tv>{

	@Override
	public int compare(tv t1, tv t2) {
		// TODO Auto-generated method stub
		if(t1.tvRating==t2.tvRating)
		return 0;
		if(t1.tvRating>t2.tvRating)
			return 1;
		else
			return -1;
	}

}
