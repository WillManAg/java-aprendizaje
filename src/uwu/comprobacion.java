package uwu;

import java.util.Scanner;

public class comprobacion {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Introduce un número:");
		
		numero = teclado.nextDouble();
		
		if (numero > 10) {
			
			System.out.println(numero + " es mayor que 10");
		}
		
		teclado.close();
		

	}

}
