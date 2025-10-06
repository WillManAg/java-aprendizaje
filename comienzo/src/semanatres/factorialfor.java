package semanatres;

import java.util.Scanner;

public class factorialfor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int factorial = 1;
		
		System.out.println("De qué número quieres el factorial:");
		
		int numero = teclado.nextInt();
		
		while(numero<=0) {
			
			System.out.println("Mayor que 0");
			
			numero = teclado.nextInt();
		}
		
		for (int i=1; i <= numero; i++) {
			
			factorial = factorial * i;
			
		}
		
		System.out.println("El factorial de " + numero + " es: " + factorial);
		
		teclado.close();
	}

}
