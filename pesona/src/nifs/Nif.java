package nifs;

public class Nif {
	
	private int numero;
	private char letra;
	private final int DIVISOR_LETRAS = 23;

	public Nif() {
		this.numero = 0;
		this.letra=' ';
	}
		
	
	public Nif(int numero) {
		this.numero = numero;
		this.asignarLetra();
	}
	
	private void asignarLetra() {
		
		switch(this.numero%this.DIVISOR_LETRAS) {
			case 0: this.letra= 'T';
			break;
			case 1: this.letra='R';
			break;
				// resto de letras hata el 22
			
		}
	}
	

	public void mostrarDatos() {
		System.out.println("NIF: " + this.numero + " - " + this.letra);
	}
	
}
