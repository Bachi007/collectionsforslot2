package com.bankApp;

import java.util.ArrayList;

public class laptopshowroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		laptop l1=new laptop(101,"Lenovo","Ideapad  330",45000);
		laptop l2=new laptop(102,"HP","pro book",50000);
		laptop l3=new laptop(103,"Dell","inspiron",40000);
		laptop l4=new laptop(104,"Acer","Predator",85000);
		laptop l5=new laptop(105,"Redmi","notebook",35000);
		laptop l6=new laptop(106,"Asus","Tuf gaming",48000);
		laptop l7=new laptop(107,"MSI","Gaming v3",55000);
		laptop l8=new laptop(108,"Apple","Macbook Pro",95000);
		ArrayList<laptop> al=new ArrayList<laptop>();
		al.add(l8);al.add(l7);al.add(l6);al.add(l5);al.add(l4);al.add(l3);al.add(l2);al.add(l1);
		
		
		al.stream().filter(lap->lap.lapPrice>=50000)
				   .forEach(lap->{System.out.println(lap.lapCompany+" "+lap.lapModel+" Rs:"+lap.lapPrice);});
		
		
		
		
		
		
	}

}
