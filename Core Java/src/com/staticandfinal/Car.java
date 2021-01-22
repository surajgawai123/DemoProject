package com.staticandfinal;

public class Car {

	final int PRICE;
	final String color;
	final static String Owner_Name;

	{
		color = "black";

	}

	static {
		Owner_Name = "suraj";

	}

	Car(int price) {
		PRICE = price;
	}
	
	public static void main(String[] args) {
		Car cc=new Car(10000);
		System.out.println(cc.color);
		System.out.println(cc.PRICE);
		
	}

}
