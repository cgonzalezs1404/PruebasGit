package com.test;

public class HelloWorld {
	
	private static CesarClass cesar;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cesar = new CesarClass();
		cesar.MetodoPrueba();
		
		MiguelClass m = new MiguelClass();
		System.out.println(m.toString());

	}

}
