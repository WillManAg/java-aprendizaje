package semanatres;

public class ejercicio41 {

	public static void main(String[] args) {


		final int numMax = 700;
		int total = 0;
		
		for (int i=10; i <= numMax ; i+=2) {
			
			total += i;
		}

		System.out.println("La suma de todos los múltiplos de 2 desde el 10 hasta el 700 es: " + total);
	}

}
