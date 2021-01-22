package com.staticandfinal;

public class StaticEx {
	static int a = 3;
	static int b;
	static int MAX;

	static {
		System.out.println("First static block");
		b = a * 4;
	}

	static {
		System.out.println("Second static block");
		MAX = 10;
	}

	static void meth(int x) {
		System.out.println("x=" + x);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("MAX=" + MAX);

	}

	public static void main(String[] args) {
		meth(42);
	}
}
