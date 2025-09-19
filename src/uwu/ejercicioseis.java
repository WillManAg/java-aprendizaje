package uwu;

import java.util.Scanner;

public class ejercicioseis {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double distancia, dias, precioCON, precioSIN;
		final double PRECIO = 8.5;
		
		System.out.println("Cuántos días quieres viajar?");
		
		dias = teclado.nextDouble();
		
		System.out.println("A cuántos kilometros está tu destino");
		
		distancia = teclado.nextDouble();
		
		if ((distancia > 1000) && (dias > 7)) {
			
			precioCON = PRECIO * distancia * 0.70 * 2;
			
			System.out.println("Pues te va a salir por: " + precioCON + " pesetas, la ida y vuelta.");
			
		} else {
			
			precioSIN = PRECIO * distancia * 2;
			
			System.out.println("Pues te va a salir por: " + precioSIN + " pesetas, la ida y vuelta.");
			
		}
		
		teclado.close();

	}

}
