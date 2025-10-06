package semanados;

import java.util.Scanner;

public class ejercicio42 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num, contador = 0, total = 0;
		
		System.out.println("Vamos a introducir cifras hasta el 0");
		
		System.out.println("Introduce un número");
		num = teclado.nextInt();
		
		while (num != 0) {
			
			total = total + num;
			
			contador++;
			
			System.out.println("Introduce un número");
			num = teclado.nextInt();
			
		}
		
		System.out.println("La media aritmética es: " + (total/contador));
		

		teclado.close();
	}

}
