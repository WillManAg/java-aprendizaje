package basket;

public class Jugador {
	
	private double altura;
	private double porcentajeDos;
	private double porcentajeTres;
	
	public Jugador() {
		
		this.altura = 1.85;
		this.porcentajeDos = 40;
		this.porcentajeTres = 25;
		
	}
	
	public Jugador(double altura, double porcentajeDos, double porcentajeTres) {
		
		this.altura = altura;
		this.porcentajeDos = porcentajeDos;
		this.porcentajeTres = porcentajeTres;
		
	}
	
	public boolean lanzarDeDos() {
		
		if (Math.random()<this.porcentajeDos/100) {
			return true;
			
		} else {
			
			return false;
		}
		
	}
	
	public boolean lanzarDeTres() {
		
		if (Math.random()<this.porcentajeTres/100) {
			return true;
			
		} else {
			
			return false;
		}
		
	}

}
