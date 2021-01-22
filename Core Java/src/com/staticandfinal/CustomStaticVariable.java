package com.staticandfinal;

public class CustomStaticVariable {

	static int MAX=10;
	int min=5;
	
	public static void main(String[] args) {
		CustomStaticVariable cc=new CustomStaticVariable();
		System.out.println("min+1 ="+(cc.min+1));
		System.out.println("MAX+1 ="+(MAX+1));
	}
}
