package pdf;

public class Main {

	public static void main(String[] args) {
		
		String texto, texto2, roar, texto3;
		int longitud, posicion;
		char primero, ultimo;
		
		texto = new String ("Pikachu");
		texto = "Charizard";
		
		System.out.println(texto);
		
		longitud = texto.length();
		
		System.out.println("Tiene " + longitud + " caracteres.");
		
		primero=texto.charAt(0);
		System.out.println("La primera letra es: " + primero);
		
		ultimo=texto.charAt(texto.length()-1);
		System.out.println("El último carácter es: " + ultimo);
		
		texto = "Heavy ";
		texto2 = "metal ";
		texto = texto + texto2;
		
		System.out.println(texto);
		
		texto = texto.concat(texto2);
		System.out.println(texto);
		
		posicion=texto.indexOf("a");
		System.out.println("La letra a, está en la posición " + posicion);
		
		roar = texto.substring(1, 6);
		
		System.out.println(roar);
		
		texto3=texto.substring(texto.indexOf("m"));
		
		System.out.println(texto3);
		

	}

}
