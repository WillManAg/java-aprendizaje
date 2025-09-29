package semanados;

import java.util.Scanner;

public class ejerciciopiramide {

	public static void main(String[] args) {
		
		int numeroLeido, lineas, contador = 1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Numero: ");
		numeroLeido = teclado.nextInt();
		lineas=1;
		
		while (lineas <= numeroLeido) {
			
			while (contador <= lineas) {
				
				System.out.print(contador + " ");
				contador++;
			}
			
			System.out.println();
			lineas++;
		}

	}

}
