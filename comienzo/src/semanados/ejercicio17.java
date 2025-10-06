package semanados;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);

		final int maximo = 5;
		int contador = 0;
		int suma = 0;
		
		System.out.println("Introduce " + maximo + " números." );
		
		while (contador < maximo) {
			
			System.out.println("Número " + (contador + 1));
			
			int cuenta = teclado.nextInt();
			
			// suma = suma + cuenta;
			
			suma += cuenta;
			
			contador++;
			
		}
		
		double media = suma / maximo;
		
		System.out.println("La media es: " + media);
		
		teclado.close();
		

	}

}
