package semanatres;

import java.util.Scanner;

public class ejercicio38 {

	public static void main(String[] args) {
		
		// 38º.- Realizar un programa Java resuelva el siguiente problema: Se lee una secuencia de 100 números y
		// se obtiene e imprime cuantos hay positivos, negativos y nulos.

		Scanner teclado = new Scanner(System.in);
		
		int numero, positivo = 0, negativo = 0, nulo = 0;
		final int numMax = 5;
		
		
		for (int i=1; i <= numMax; i++) {
			
			System.out.println("Introduce número:");
			
			numero = teclado.nextInt();
			
			if (numero >  0) {
				
				positivo += 1;
				
			} else if (numero < 0) {
				
				negativo += 1;
			} else {
				
				nulo += 1;
				
			}
			
		}
		
		System.out.println("Has introducido: Negativos: " + negativo + " Positivos: " + positivo + " Nulos: " + nulo);
		
		teclado.close();
	}

}
