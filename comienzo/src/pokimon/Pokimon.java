package pokimon;

public class Pokimon {

		private int puntosVida;
		private double ataque;
		private double defensa;
		private Punto ubicacion;
		private char puntoCardinal; // N E S O
		
		public Pokimon(int puntosVida, double ataque, double defensa, Punto ubicacion) {
			
			this.puntosVida = puntosVida;
			this.ataque = ataque;
			this.defensa = defensa;
			this.ubicacion = ubicacion;
			this.puntoCardinal='N';
		}
		
		public void mostrarDatos() {
			
			System.out.println("Puntos vida: " + this.puntosVida);
			System.out.println("Atk " + this.ataque);
			System.out.println("Def " + this.defensa);
			System.out.println("Orientación " + this.puntoCardinal);
			System.out.println("Ubicación: ");
			this.ubicacion.mostrarDatos();
			
		}
		
		public boolean combatir(Pokimon rival) {
			
			rival.puntosVida-=(this.ataque-rival.defensa);
			if (rival.puntosVida<=0) {
				return true;
			} else {
				this.puntosVida-=(rival.ataque - this.defensa);
				
				if (this.puntosVida<=0) {
					return false;
				} else {
					
					if(this.puntosVida - rival.puntosVida >= 0) {
						
						return true;
					} else {
						return false;
					}
					
				}
				
			}
		}
		
		
	
}
