package ejstring;

public class CadenaDos {
	
	private String texto;
	
	public CadenaDos(String texto) {
		
		this.texto = texto;
		
	}
	
	public CadenaDos() {
		
		this.texto = texto;
		
	}
	
	public String esMayuscula() {
		
		return texto.toUpperCase();
		
	}
	
	public String esMinuscula() {
		
		return texto.toLowerCase();
	}

	
	
}
