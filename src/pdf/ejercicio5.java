package pdf;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double hamburguesa = 500;
		double cerveza = 150;
		double coca = 175;
		double ensalada = 200;
		double salchichas = 275;
		double refrescos = 200;
		double sopa = 260;
		double pastel = 300;
		int num1, num2, num3, num4, num5, num6, num7, num8;
		final double impuesto = 1.12;
		double venta;
		double total;
		
		System.out.println("Cuántas hamburguesas se han vendido hoy?");
		
		num1 = teclado.nextInt();
		
		System.out.println("Cuántas cervezas se han vendido hoy?");
		
		num2 = teclado.nextInt();
		
		System.out.println("Cuántas coca-colas se han vendido hoy?");
		
		num3 = teclado.nextInt();
		
		System.out.println("Cuántas ensaladas se han vendido hoy?");
		
		num4 = teclado.nextInt();
		
		System.out.println("Cuántas salchichas se han vendido hoy?");
		
		num5 = teclado.nextInt();
		
		System.out.println("Cuántos refrescos se han vendido hoy?");
		
		num6 = teclado.nextInt();
		
		System.out.println("Cuántas sopas se han vendido hoy?");
		
		num7 = teclado.nextInt();
		
		System.out.println("Cuántos pasteles se han vendido hoy?");
		
		num8 = teclado.nextInt();
		
		venta = (num1 * hamburguesa) + (num2 * cerveza) + (num3 * coca) + (num4 * ensalada) + (num5 * salchichas) + (num6 * refrescos) + (num7 * sopa) + (num8 * pastel);
		
		total = venta * impuesto;
		
		System.out.println("La venta total del día de hoy es: " + venta + "pts. Más impuestos, serían " + total + "pts.");
		
		teclado.close();

	}

}
