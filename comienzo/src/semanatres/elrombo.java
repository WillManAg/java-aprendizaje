package semanatres;

import java.util.Scanner;

public class elrombo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numero = teclado.nextInt();

        int fila = 1;

        while (fila <= numero) {


            int espacios = numero - fila;  
            
            // ---------------------------
            while (espacios > 0) {
                System.out.print("  ");    
                espacios--;
            }


            int num = fila;
            while (num >= 1) {
                System.out.print(num + " ");
                num--;
            }
            
            

            
            // ----------------------------
            System.out.println(); 
            fila++;
        }

        teclado.close();
    }
}
