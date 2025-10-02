package semanatres;

public class todoslosprimoslareves {

	public static void main(String[] args) {
		
		boolean esPrimo;

		for (int i=100; i > 1 ; i--) {
			
			esPrimo = true;
			
			for (int j= 2 ; j < i ; j++) {
				
				
				if (i%j==0) {
					esPrimo=false;
					break;
				} 
				
			}
			
			if (esPrimo) {
				System.out.print(i + " ");
			} 
			
		}

	}

}
