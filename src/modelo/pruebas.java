package modelo;

import modelo.alta_user;


public class pruebas {

	public static void main(String[] args) {
		
		alta_user usr= new alta_user();
		
		usr.registro("Rocio Rodriguez", "karla@icl");
		usr.registro_n(2);
		usr.registro_o(7, "kgonzalez", "123456");

	}

}