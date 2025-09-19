package uwu;

import java.util.Scanner;

public class ejerciciouno {

	public static void main(String[] args) {
		
		double num1, num2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el número 1");
		
		num1 = teclado.nextDouble();
		
		System.out.println("Introduce el número 2");
		
		num2 = teclado.nextDouble();
		
		if (num1 > num2) {
			
			System.out.println(num1 + " es mayor que " + num2);
			
		} else if (num1 < num2) {
			
			System.out.println(num1 + " es menor que " + num2);
			
		} else {
			
			System.out.println(num1 + " y " + num2 + " son iguales.");
		}
		
		teclado.close();
		
	}

}
