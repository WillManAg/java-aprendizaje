package pdf;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int minutos, total;
		
		System.out.println("Cuántos minutos ha durado la llamada?");
		
		minutos = teclado.nextInt();
		
		if (minutos <= 3) {
			
			System.out.println("Serán solo 10 pesetas, gracias.");
		} else {
			
			total = ((minutos - 3) * 5) + 10;
			
			System.out.println("Como te has pasado de los 3 minutos, el total serán " + total + "pts.");
			
		}
		
		teclado.close();

	}

}
