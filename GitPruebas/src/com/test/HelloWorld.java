package com.test;

public class HelloWorld {
	
	private static CesarClass cesar;
	private static RafaelClass rafa;
	private static Yazzy yaz;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cesar = new CesarClass();
		cesar.MetodoPrueba();
		cesar.MetodoPruebaBranch();
		
		MiguelClass m = new MiguelClass();
		System.out.println(m.toString());
		
		rafa = new RafaelClass();
		var res = rafa.MetodoSuma(5, 5);
		System.out.println("El resultado de mi suma es: " + res);
		
		yaz = new Yazzy();
		yaz.saludar();
		yaz.mensajeRama();
		
		MiguelClassV2 v2 = new MiguelClassV2();
		System.out.println(v2.toString());
		
				

	}

}
