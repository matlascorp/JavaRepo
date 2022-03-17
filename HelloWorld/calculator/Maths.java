package com.qa.calculator;

public class Maths {
	
	public static int add(int x, int y) {
		
		return x + y;
		
	}
	
	public static int sub(int x, int y) {
		
		return x - y; }
	
	
	
	public static int multiply(int x, int y) {
		
		return x * y;}
		
	
	public static int divide(int x, int y) {
		
		return x / y;}

	public static void calculateMethods() {
		System.out.println(add(3,6));
		System.out.println(sub(10,5));
		System.out.println(multiply(10,10));
		System.out.println(divide(10,10));
		
	}

}
