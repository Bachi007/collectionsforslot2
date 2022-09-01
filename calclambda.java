package com.bankApp;

public class calclambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addlambda ad=(x,y)->{System.out.println(x+y);};
		
		ad.addition(5, 10);
		
		sublambda sd=(x,y)->{System.out.println(y-x);};
		
		sd.subtraction(10, 20);
		wishme wm=()->{
			System.out.println("This is Greet ME");
		};
		
		wm.greetme();
	}
	

}
@FunctionalInterface
interface wishme{
	
	public void greetme();
	
}
