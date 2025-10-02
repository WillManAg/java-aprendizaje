package semanatres;

public class todoslosprimoshasta {

	public static void main(String[] args) {
		
		boolean esPrimo;
		final int max = 100;

		for (int i=2; i<=max ; i++) {
			
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
