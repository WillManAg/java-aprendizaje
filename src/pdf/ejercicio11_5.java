package pdf;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio11_5 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Introduce un número");
		
		num1 = teclado.nextInt();
		
		System.out.println("Introduce otro número mayor");
		
		num2 = teclado.nextInt();
		
		System.out.println("Introduce otro número mayor");
		
		num3 = teclado.nextInt();
		
		// primero hay que crear un array con los números almacenados en el orden que entraron
		
		int[] numeros = {num1, num2, num3};
		
		// Ahora hacemos otra lista pero la ordenamos para luego poder compararla
		
		int[] ordenados = {num1, num2, num3};
		Arrays.sort(ordenados);
		
		if (Arrays.equals (numeros, ordenados)) { 
			
			System.out.println("Los números están ordenados correctamente: " + Arrays.toString(numeros));
			
		} else {
			
			System.out.println("No es el orden correcto, deberían estar así: " + Arrays.toString(ordenados));
			
		}
		
		
		
		
		
		teclado.close();
		
	}

}
