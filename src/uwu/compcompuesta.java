package uwu;

import java.util.Scanner;

public class compcompuesta {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Introduce un número:");
		
		numero = teclado.nextDouble();
		
		if (numero > 10) {
			
			System.out.println(numero + " es mayor que 10");
			if (numero%2==0) {
				System.out.println(numero + " es par");
			} else {
				System.out.println(numero + " no es par");
			}
		} else {
			
			System.out.println(numero + " no es mayor que 10");
		}
		
		teclado.close();

	}

}
