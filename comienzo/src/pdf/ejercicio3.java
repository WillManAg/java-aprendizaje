package pdf;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double catetouno, catetodos, hipotenusa;
		
		System.out.println("Introduce un cateto:");
		
		catetouno = teclado.nextDouble();
		
		System.out.println("Introduce otro cateto");
		
		catetodos = teclado.nextDouble();
		
		hipotenusa = Math.sqrt(catetouno * catetouno + catetodos * catetodos);
		
		System.out.println("La hipotenusa es igual a: " + hipotenusa);

		teclado.close();
	}

}
