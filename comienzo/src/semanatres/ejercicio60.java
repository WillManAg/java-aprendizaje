package semanatres;

import java.util.Scanner;

public class ejercicio60 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		final int max = 10;
		int numero;
		
		for (int i = 1; i <= max; i++) {
			
			System.out.println("Introduce un número del 1 al 49");
			numero = teclado.nextInt();
			
			while (!(numero > 0 && numero < 50)) {
				
				System.out.println("Es número no cumple las condiciones");
				System.out.println("Introduce un número del 1 al 49");
				numero = teclado.nextInt();
				
			}
			
			if (numero <= 10) {
				
				System.out.println("Primera decena");
				
			} else if (numero <= 20) {
				
				System.out.println("Segunda decena");
				
			} else if (numero <= 30) {
				
				System.out.println("Tercera decena");
				
			} else if (numero <= 40) {
				
				System.out.println("Cuarta decena");
			} else {
				
				System.out.println("Quinta decena");
				
			}
			
		}
		
		
		teclado.close();
	}

}
