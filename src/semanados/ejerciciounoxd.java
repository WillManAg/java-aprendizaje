package semanados;

import java.util.Scanner;

public class ejerciciounoxd {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0, numero, maximo = 1;
		
		final int total = 3;
		
		System.out.println("Introduce 100 numeros para saber cuál es mayor");
		
		while (contador < total) {
			
			System.out.println("Introduce un número");
			
			numero = teclado.nextInt();
			
			if (numero > maximo) {
				
				maximo = numero;
				
			}
			
			contador++;
		}

		System.out.print("El número más grande es " + maximo);
		
		teclado.close();
	}

}
