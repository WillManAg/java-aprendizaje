package pdf;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Introduce un número");
		
		num1 = teclado.nextInt();
		
		System.out.println("Introduce otro número mayor");
		
		num2 = teclado.nextInt();
		
		System.out.println("Introduce otro número mayor");
		
		num3 = teclado.nextInt();
		
		if ((num1 < num2) && (num2 < num3)) {
			
			System.out.println("Los números se han introducido correctamente");
			
		} else {
			
			System.out.println("Debes introducir los números de menos a mayor.");
			
		}

		teclado.close();
		
	}

}
