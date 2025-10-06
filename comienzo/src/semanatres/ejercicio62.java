package semanatres;

import java.util.Scanner;

public class ejercicio62 {

	public static void main(String[] args) {
		// sacar la media de las notas de 2 clases

		Scanner teclado = new Scanner(System.in);
		
		final int max = 25;
		double notaA= 0, notaB = 0;
		int contadorA = 0, contadorB = 0;
		
		System.out.println("Nota del A");
		notaA = teclado.nextDouble();
		
		System.out.println("Nota del B");
		notaA = teclado.nextDouble();
		
		for (int i=1 ; i <= max ; i++) {
			
				
				notaA+=i;
				contadorA+=1;
				
			
			
		}
		
		System.out.println("La nota media del A es: " + (esPar/contadorA));
		System.out.println("La suma de todos los impares es: " + (esImpar/contadorB));

	}

}
