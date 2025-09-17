package uwu;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		
		int numero1,numero2,resultado;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce número 1:");
		
		numero1 = teclado.nextInt();
		
		System.out.println("Introduce número 2:");
		
		numero2 = teclado.nextInt();
		
		resultado = numero1 + numero2;
		
		System.out.println("El resultado es: " + resultado);

		teclado.close();
		
	}

}
