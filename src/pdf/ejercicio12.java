package pdf;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Introduce un número");
		
		numero = teclado.nextDouble();
		
		if (numero >= 10 && numero <= 100) {
			
			System.out.println("El número está entre 10 y 100");
			
		} else {
			
			System.out.println("El número no está entre 10 y 100");
			
		}
		
		teclado.close();
		
	}

}
