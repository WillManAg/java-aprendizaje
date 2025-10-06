package uwu;

import java.util.Scanner;

public class ejercicioandres {

	public static void main(String[] args) {
		
		int valor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce dato");
		valor = teclado.nextInt();
		
		if ((valor > 0 && valor % 2 == 0) || (valor < 0 || valor > 10)) {
			
			System.out.println("Es valido");
			
		} else {
			
			System.out.println("No es válido");
			
		}
		
		
		teclado.close();

	}

}
