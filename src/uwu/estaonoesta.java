package uwu;

import java.util.Scanner;

public class estaonoesta {

	public static void main(String[] args) {

		int numeroTeclado;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		
		numeroTeclado = teclado.nextInt();
		
		if (numeroTeclado >= 1 && numeroTeclado <= 10) {
			System.out.println("Está entre 1 y 10");
		} else {
			System.out.println("No está entre 1 y 10");
		}

		teclado.close();
	}

}
