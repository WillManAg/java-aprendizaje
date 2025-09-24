package semanados;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int operador = 1;
		
		System.out.println("Qué número entre 1 y 9 quieres multiplicar?");
		
		int numero = teclado.nextInt();
		
		while (!(numero>=1 && numero<=9)) {
			
			System.out.println("Entre 1 y 9, por favor.");
			
			numero=teclado.nextInt();
		}
		
		while (operador <= 9) {
			
			System.out.println(numero + " x " + operador + " = " + (numero * operador));
			
			operador++;
			
		}
		
		teclado.close();
	}

}
