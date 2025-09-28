package semanados;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		// 24º.- Realizar un programa Java que resuelva el siguiente problema: Se debe obtener el producto de dos
		// números A y B introducidos por teclado, mediante sumas sucesivas.
		// (7*4= 7+7+7+7, es decir se suma el número A B veces)

		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, contador = 1;
		
		System.out.println("Introduce el primer operador");
		
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo operador");
		
		num2 = teclado.nextInt();
		
		System.out.print("El resultado es: " + num1 + " * " + num2 + " = ");
		
		while (contador < num2) {
			
			System.out.print(num1 + " + ");
			
			contador++;
			
		}
		
		System.out.print(num1 + " = " + (num1*num2));

		teclado.close();
	}

}
