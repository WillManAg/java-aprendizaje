package semanatres;

public class ejercicio61 {

	public static void main(String[] args) {
		// 61º.- Realizar un programa Java que calcule independientemente la suma de los pares e impares
		// comprendidos entre 1 y 200.

		final int max = 200;
		int esPar= 0, esImpar = 0;
		
		for (int i=1 ; i <= max ; i++) {
			
			if (i%2==0) {
				
				esPar+=i;
				
			} else {
				
				esImpar+=i;
				
			}
			
		}
		
		System.out.println("La suma de todos los pares es: " + esPar);
		System.out.println("La suma de todos los impares es: " + esImpar);

	}

}
