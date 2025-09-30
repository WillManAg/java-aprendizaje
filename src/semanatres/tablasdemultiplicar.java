package semanatres;

import java.util.Scanner;

public class tablasdemultiplicar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Cuántas tablas de multiplicar quieres?");
		
		numero = teclado.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			
			for (int j = 1; j < 10; j++) {
				
				System.out.println (i + " * " + j + " = " + (i*j));
				
			}
			
		}
		
teclado.close();
	}

}
