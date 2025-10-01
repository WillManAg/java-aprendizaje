package semanatres;

import java.util.Scanner;

public class esprimo {

	public static void main(String[] args) {
		
		// valores bandera
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		boolean esPrimo;
		
		System.out.println("Número: ");
		numero = teclado.nextInt();
		
		esPrimo = true;
		for (int i=2; i<numero ; i++) {
			
			if (numero%i==0) {
				esPrimo=false;
			} 
			
		}
		
		if (esPrimo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
		
		teclado.close();
	}

}
