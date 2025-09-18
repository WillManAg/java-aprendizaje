package uwu;

import java.util.Scanner;

public class pruebados {

	public static void main(String[] args) {

		int numeroTeclado;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		
		numeroTeclado = teclado.nextInt();
		
		if ((numeroTeclado >= 1 && numeroTeclado <= 10) || (numeroTeclado >= 90 && numeroTeclado <= 100)) {
			System.out.println("Es válido");
		} else {
			System.out.println("No es válido");
		}

		teclado.close();
	}

}