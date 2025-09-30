package semanatres;

import java.util.Scanner;

public class tablamultiplicar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número entre 1 y 9");
		
		int numero = teclado.nextInt();
		
		while (numero < 1 || numero > 9) {
			
			System.out.println("Introduce un número entre 1 y 9 te dije ctm");
			
			numero = teclado.nextInt();
			
		}
		
		for (int i = 1; i < 10; i++) {
			
			System.out.println(numero + " * " + i + " = " + (numero * i));
			
		}
		
		teclado.close();
	}

}
