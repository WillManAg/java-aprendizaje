package pdf;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Dime el valor de a");
		
		a = teclado.nextDouble();
		
		System.out.println("Dime el valor de b");
		
		b = teclado.nextDouble();
		
		System.out.println("Dime el valor de c");
		
		c = teclado.nextDouble();
		
		double discriminante = Math.pow(b, 2) - (4 * a * c);
		
		if (discriminante < 0) {
			
			System.out.println(" No se puede resolver ");
			
		} else if (discriminante == 0) {
			
			double x = -b / (2 * a);
			
			System.out.println(" La solución es: x = " + x);
			
		} else {
			
			double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			
			System.out.println("La ecuación tiene dos soluciones: ");
			System.out.println("x1 = " + x1);
			System.out.print("x2 = " + x2);
			
		}

		teclado.close();
	}

}
