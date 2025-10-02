package semanatres;

import java.util.Scanner;

public class ejercicio64 {

	public static void main(String[] args) {
		// 64º .- Desarrollar un programa Java que imprima los N primeros primos. N es introducido por teclado.
		
		Scanner teclado = new Scanner(System.in);
		
			boolean esPrimo;
			int max, suma = 0;
			
			System.out.println("Cuántos números primos quieres?");
			max = teclado.nextInt();

			for (int i=2; suma < max; i++) {
				
				esPrimo = true;
				

				for (int j= 2 ; j < i ; j++) {
					
					
					if (i%j==0) {
						esPrimo=false;
						break;
					} 
					
				}

				if (esPrimo) {
					System.out.print(i + " ");
					suma+=1;
				} 
				
			}

			teclado.close();
		}

	}
