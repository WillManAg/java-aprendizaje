package uwu;

import java.util.Scanner;

public class And_or_not {

	public static void main(String[] args) {

		int numeroTeclado1, numeroTeclado2 = 9;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		
		numeroTeclado1 = teclado.nextInt();
		
		if ((numeroTeclado1 > 9) && (numeroTeclado1 % 2==0) || (numeroTeclado2 % 3==0 && numeroTeclado2 % 5==0)) {
			System.out.println("uwu");
		}

		teclado.close();
	}

}
