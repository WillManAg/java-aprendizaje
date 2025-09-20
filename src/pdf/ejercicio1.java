package pdf;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		double pulgada,resultado;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el número de pulgadas que quieres transformar:");
		
		pulgada = teclado.nextDouble();
		
		resultado = pulgada * 2.54;
		
		System.out.println(pulgada + " pulgadas, es igual a " + resultado + " centímetros");

		teclado.close();
	}

}
