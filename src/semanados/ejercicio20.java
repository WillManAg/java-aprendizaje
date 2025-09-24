package semanados;

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        
        // 20º Realizar un programa Java que imprima los N primeros múltiplos de 4. N es introducido por teclado.
        
        Scanner teclado = new Scanner(System.in);
        
        int n, total = 0, contador = 0, numero = 1;
        
        System.out.println("Cuántos múltiplos de 4 quieres?");
        
        n = teclado.nextInt();
        
        while (contador < n) {
            
            if (numero % 4 == 0) {
                
                total += numero;
                
                contador++;
                
            }
            
            numero++;
            
        }
        
        System.out.println("La suma de los " + n + " primeros multiplos de 4, es : " + total);
        
        teclado.close();

    }

}