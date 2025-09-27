package semanados;

import java.util.Scanner;

public class juegoadivinar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroAleatorio = (int) (Math.random() * 100 + 1);
		// int numeroAleatorio = 50;
		
		
		int contador = 0, numero;
		
		System.out.println("Adivina un número entre el 1 y 100");
		
		
		while (contador < 8 ) {
			
			System.out.println("Introduce un numero");
			numero = teclado.nextInt();
			
				
				if (numero < 1 || numero > 100) {
					
					System.out.println("El número no está entre 1 y 100");
					 
				} else if (numero < numeroAleatorio) {
					
					System.out.println("El número es mayor");
					contador++;
				} else if (numero > numeroAleatorio){
					System.out.println("El número es menor");
					contador++;
				} else {
					System.out.println("¡FELICIDADES, HAS GANADO!");
					System.out.println("El número era: " + numeroAleatorio);
					contador = contador + 50;	
				}	
		
			if (contador >= 7 && contador <= 40) {
				
				System.out.println("Lo siento has superado el máximo de intentos");
				System.out.println("El número era: " + numeroAleatorio);
				
			}
		}
		
		teclado.close();
	}

	}
