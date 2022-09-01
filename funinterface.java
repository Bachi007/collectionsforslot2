package com.bankApp;

public class funinterface {

	public static void main(String[] args) {

		anudip anp=()->{System.out.println("Hello world");};
		anp.webdesigning();
	}

}

@FunctionalInterface
interface anudip{
	
	public void webdesigning();
	
}
