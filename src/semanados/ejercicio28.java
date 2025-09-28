package semanados;

import java.util.Scanner;

public class ejercicio28 {
	
	public static void main(String[] args) {
	
		// 28º.- Realizar programa Java que calcule el cociente y el resto de una división en la que el dividendo y
		// el divisor son dos números introducidos por teclado.
		
		Scanner teclado = new Scanner(System.in);
		
		int dividendo, divisor, cociente = 0;
		
		System.out.println("Dividendo");
		
		dividendo = teclado.nextInt();
		
		System.out.println("Divisor");
		
		divisor = teclado.nextInt();
		
		while (dividendo >= divisor) {
			
			dividendo = dividendo - divisor;
			
			cociente++;
			
		}
		
		System.out.println("El resultado de la división, sería: Cociente = " + cociente + " Resto = " + dividendo);
		
		teclado.close();
	}
}
