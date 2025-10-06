package pdf;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double portatiles = 10000;
		int operador;
		double total;
		
		System.out.println("Buenas tardes, tenemos portátiles a 10.000pts");
		System.out.println("¿Cuántos quiere?");
		
		operador = teclado.nextInt();
		
		total = operador * portatiles * 1.12;
		
		if (total > 50000) {
			
			System.out.println("El total sería, " + total + "pts.");
			
			total = total * 0.95;
			
			System.out.println ("Pero te hacemos un 5% de descuento, quedarían: " + total + "pts.");
			
		} else {
			
			System.out.println("EL total sería " + total + "pts.");
		}
		
		teclado.close();

	}

}
