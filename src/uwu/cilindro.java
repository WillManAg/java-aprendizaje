package uwu;

import java.util.Scanner;

public class cilindro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double radio,altura,sl,sb,st,v;
		
		System.out.println("Introduce el radio del Cilindro:");
		
		radio = teclado.nextDouble();
		
		System.out.println("Introduce la altura del Cilindro:");
		
		altura = teclado.nextDouble();
		
		sl = 2 * Math.PI * radio * altura;
		sb = Math.PI * Math.pow(radio,  2);
		st = sl + 2 * sb;
		v = sb * altura;
		
		System.out.println("Resultados:");
		System.out.println("Superficie lateral: " + sl);
		System.out.println("Superficie de la base: " + sb);
		System.out.println("Superficie total: " + st);
		System.out.println("Volumne: " + v);
		
		teclado.close();

	}

}
