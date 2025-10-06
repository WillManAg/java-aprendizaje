package semanatres;

import java.util.Scanner;

public class ejercicio54 {

	public static void main(String[] args) {
		
		// 54º.- Realizar un programa Java que permita introducir 10 parejas de números naturales A,B y para cada
		// una de ellas, visualizar su producto por el método de las sumas sucesivas.
		// (Nota 7*3=3+3+3+3+3+3+3, es decir se suma B, A veces).

		Scanner teclado = new Scanner(System.in);
		
		final int numMax = 10;
		int num1, num2;
		
		for (int i=1; i <= numMax; i++) {
			
			System.out.println("Número 1: ");
			num1 = teclado.nextInt();
			System.out.println("Número 2: ");
			num2 = teclado.nextInt();
			
			int resultado = num1;
				
				System.out.print(num1 + " * " + num2 + " = " );
				
				for (int k = 1; k < num2; k++) {
					
					System.out.print(num1 + " + ");
					
					resultado+=num1;
				}
				
				System.out.println(num1 + " = " + (resultado));
			
		}
		
		teclado.close();
	}

}
