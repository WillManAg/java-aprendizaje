package semanatres;

import java.util.Scanner;

public class nummaspequeno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        int numero;
        int menor = 0;
        final int maximo = 5;

        System.out.println("Introduce el número 1:");
        menor = teclado.nextInt();


        for (int i = 2; i <= maximo; i++) {
            System.out.println("Introduce el número " + i + ":");
            numero = teclado.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El menor de todos los números introducidos es: " + menor);
        
        teclado.close();
		
	}

}
