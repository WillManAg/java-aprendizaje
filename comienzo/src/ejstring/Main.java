package ejstring;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String texto, mayusculas, minusculas, nombre, nombre1, nombre2, numero1;
		char primeroMayusculas;
		char primero, digito;
		int contador;

		Scanner teclado = new Scanner(System.in);
		
		texto = new String ("Cositas que cosas de las cositas cosotas cosas");
		
		System.out.println("Cadena original: " + texto);
		
		mayusculas = texto.toUpperCase();
		
		System.out.println("En mayusculas" + mayusculas);
		
		minusculas = texto.toLowerCase();
		
		System.out.println("En minusculas " + minusculas);
		
		if (texto.length()>=2) {
			System.out.println("Dos primeros: " + texto.substring(0,2));
			System.out.println("Dos últimos " + texto.substring(texto.length()));
		}
		
		int longitud = texto.length();
		primero = texto.charAt(0);
		primeroMayusculas = Character.toUpperCase(primero);
		for(int i=0; i<longitud; i++) {
			if(primero==texto.charAt(i)) {
				System.out.print(primeroMayusculas);
			} else {
				System.out.print(texto.charAt(i));
			}
		}
		System.out.println();
		
//		System.out.println("Introduce nombre ");
//		nombre = teclado.next();
//		System.out.println(nombre);
		
//		System.out.println("Introduce nombre ");
//		nombre1 = teclado.next();
//		nombre2 = teclado.next();
//		
//		System.out.println("Nombre" + nombre1 + nombre2);
//		
		
		System.out.println("Número");
		contador = Integer.parseInt(teclado.nextLine());
		System.out.println("Número");
		numero1 = teclado.nextLine();
;		System.out.println("Nombre");
		nombre = teclado.nextLine();
		System.out.println(contador + nombre);
		
		numero1 = String.valueOf(contador);
		numero1 = Integer.toString(contador);
		
		digito='2';
		if (digito>='0'&&digito<='9') 
			
		if (Character.isDigit(digito))
		
		teclado.close();
	}


}
