package com.staticandfinal;

public class Apple {

	 int quantity = 10;

	 void show() {
		 quantity = 50;

	}

	public static void main(String[] args) {
		Apple aa = new Apple();
		aa.show();
	}
}
