package semanados;

public class ejercicio18 {

    public static void main(String[] args) {


        // 18º.- Realizar un programa Java que visualice la suma de los 10 primeros números pares.
        
        int total = 0;
        int numero = 2;
        int contador = 0;

        while (contador < 10) {
            if (numero % 2 == 0) {
                total += numero;   
                contador++;        
            }
            
            numero = numero + 2; // numero+=2              
        }

        System.out.println("La suma de los 10 primeros pares es: " + total);
    }

}