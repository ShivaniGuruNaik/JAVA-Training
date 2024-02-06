package com.tnsif.ExceptionHandling;

public class TryCatchExample {
	static void performDivision (int x, int y){
		int z;
		try {
			System.out.println("I am in try block");
			z=x/y;
			System.out.println("result is " +z);
		}
		catch(ArithmeticException e) {
			System.out.println("i am in catch block" +e.getMessage());
		}
	}
}