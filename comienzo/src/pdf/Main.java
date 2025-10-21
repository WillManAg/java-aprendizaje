package pdf;

public class Main {

	public static void main(String[] args) {
		
		String texto;
		int longitud;
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

	}

}
