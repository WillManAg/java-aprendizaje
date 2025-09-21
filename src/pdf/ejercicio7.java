package pdf;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double mmarina = 1852;
		double mterrestre = 1609;
		double kilometro = 1000;
		double recorrido, total;
		
		System.out.println("Cuántos kilometros has recorrido?");
		
		recorrido = teclado.nextDouble();
		
		total = recorrido * kilometro / mmarina;
		
		// String.format %.2f sirve para limitar el número de decimales que va a mostrar como resultado double
		
		System.out.println("Has recorrido " + String.format("%.2f", total) + " millas marinas.");
		
		total = recorrido * kilometro / mterrestre;
		
		System.out.println("Has recorrido " + String.format("%.2f", total) + " millas terrestres.");
		
		teclado.close();

	}

}
