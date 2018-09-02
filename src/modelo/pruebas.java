package modelo;

import modelo.alta_user;


public class pruebas {

	public static void main(String[] args) {
		
		alta_user usr= new alta_user();
		
		usr.registro(11, "Marina Ramos", "marina@icloud.com");
		usr.registro_n(11, 1);
		usr.registro_o(11, 3, "mramos", "123456");

	}

}