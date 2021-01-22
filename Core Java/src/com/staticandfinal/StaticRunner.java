package com.staticandfinal;

public class StaticRunner {
	public static void main(String[] args) {
		StaticTest ss = new StaticTest();
		System.out.println("2*2 =" + ss.multiply(2, 2));

		System.out.println("2+3 =" + StaticTest.add(2, 3));
	}
}
