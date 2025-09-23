package semanados;

import java.util.Scanner;

public class menuwhile {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		
		int operador;
		int opcion = 1;
		
		while (opcion != 5) {
		
		System.out.println("Introduce el número que quieres operar:");
		
		operador = teclado.nextInt();
		
        
		System.out.println("Elige una opción");
        System.out.println("1. Número al cuadrado");
        System.out.println("2. Raiz Cuadrada");
        System.out.println("3. Valor absoluto");
        System.out.println("4. Es múltiplo de 3");
        System.out.println("5. Salir");
        
        opcion = teclado.nextInt();
        
        switch (opcion) {
            case 1:  System.out.println(Math.pow(operador, 2));
                     break;
            case 2:  System.out.println(Math.sqrt(operador));
                     break;
            case 3:  System.out.println(Math.abs(operador));
                     break;
            case 4:  if (operador % 3 == 0) {
            	
            	System.out.println("Es múltiplo de 3");
            } else {
            	
            	System.out.println("No es múltiplo de 3");
            }
            	
                     break;
            case 5:  System.out.println("Adiós");
            		break;
            default: System.out.println("Ese número no estaba en las opciones");
                     break;
        }
        
		}
        
        teclado.close();


	}

}
