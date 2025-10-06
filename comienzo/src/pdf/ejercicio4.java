package pdf;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double operador;
		double resultado;
		double dolar = 122.499;
		double chelin = 9.56871;
		double dracma = 0.88607;
		double lira = 0.09289;
		double franco = 20.110;
		
		
		System.out.println("Cuántos Chelines Austriacos, quieres cambiar a pesetas? ");
		
		operador = teclado.nextDouble();
		
		resultado = operador * chelin;
		
		System.out.println("Estas son las pesetas que te corresponden: " + resultado + "pts.");
		
		System.out.println("Cuántas Dracmas Griegas quieres cambiar por Francos Franceses");
		
		operador = teclado.nextDouble();
		
		resultado = operador * dracma / franco;
		
		System.out.println("Estos son los Francos Franceses que te corresponden: " + resultado);
		
		System.out.println("Dime cuantas pesetas tienes y te digo cuántos Dolares o Liras te daría");
		
		operador = teclado.nextDouble();
		
		resultado = operador / dolar;
		
		System.out.println("En dolares sería: " + resultado);
		
		resultado = operador / lira;
		
		System.out.println("Y en Liras Italianas serían: " + resultado);
		
		teclado.close();
		
	}

}
