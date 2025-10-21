package ejstring;

public class Main {

	public static void main(String[] args) {

		String texto, mayusculas, minusculas, primeroMayusculas;
		char primero;
		
		texto = new String ("Cositas que cosas de las cositas cosotas cosas");
		
		System.out.println("Cadena original: " + texto);
		
		mayusculas = texto.toUpperCase();
		
		System.out.println("En mayusculas" + mayusculas);
		
		minusculas = texto.toLowerCase();
		
		System.out.println("En minusculas " + minusculas);
		
		if (texto.length()>=2) {
			System.out.println("Dos primeros: " + texto.substring(0,2));
			System.out.println("Dos últimos " + texto.substring(texto.length()));
		}
		
		primero = texto.charAt(0);
		primeroMayusculas = Character.toUpperCase(primero);
		
		

	}

}
