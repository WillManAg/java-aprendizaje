package uwu;

import java.util.Scanner;

public class ejerciciolaura {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int edad, dia, compañia;
		
		System.out.println("Qué edad tienes");
		
		edad = teclado.nextInt();
		
		System.out.println("Responde con 1 si estás acompañado, responde con 0 si no estás acompañado");
		
		compañia = teclado.nextInt();
		
		System.out.println("Responde el día de la semana que es, siendo Lunes = 1, Domingo = 7");
		
		dia = teclado.nextInt();
		
		if ((edad >= 18) || ((edad == 17) && (compañia == 1) && (dia == 5))) {
			
			System.out.println("Puedes entrar a la discoteca");
			
		} else {
			
			System.out.println("No puedes pasar, sorry");
		}
		
		teclado.close();
		
	}

}
