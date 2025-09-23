package semanados;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int operador = 1;
		
		System.out.println("Qué número quieres multiplicar?");
		
		int numero = teclado.nextInt();
		
		while (operador <= 9) {
			
			System.out.println("El resultado es: " + (numero * operador));
			
			operador++;
			
		}
		
		teclado.close();
	}

}
