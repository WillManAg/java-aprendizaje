package uwu;

import java.util.Scanner;

public class mayorque {

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
			
		} else if ((num1 < num2) && (num2 > num3)) {
			
			System.out.println("Mal, debía introducirlos en este orden: " + num1 + num3 + num2);

		} else if ((num1 > num2) && (num2 < num3)) {
			
			System.out.println("Mal, debía introducirlos en este orden: " + num3 + num2 + num3);
		}

		teclado.close();
		
	}

}
