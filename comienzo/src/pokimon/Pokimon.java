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
		
		
		
		public char getPuntoCardinal() {
			return puntoCardinal;
		}

		public Punto getUbicacion() {
			return ubicacion;
		}



		public void caminar() {
			
			switch (this.puntoCardinal) {
			
				case 'N' : this.ubicacion.setY(this.ubicacion.getY() + 1);
						break;
				case 'E' : this.ubicacion.setX(this.ubicacion.getX() + 1);
						break;
				case 'S' : this.ubicacion.setY(this.ubicacion.getY() - 1);
						break;
				case 'O' : this.ubicacion.setX(this.ubicacion.getX() - 1);
						break;
			}
			
		}
		
		public void avanzar(int cantidadAvanzar) {
			
			// caminar mucho ocn bucle
			// for (int i=0; i<cantidadAvanzar; i++) {
				// this.caminar();
			// }
			
			switch (this.puntoCardinal) {
			
			case 'N' : this.ubicacion.setY(this.ubicacion.getY() + cantidadAvanzar);
					break;
			case 'E' : this.ubicacion.setX(this.ubicacion.getX() + cantidadAvanzar);
					break;
			case 'S' : this.ubicacion.setY(this.ubicacion.getY() - cantidadAvanzar);
					break;
			case 'O' : this.ubicacion.setX(this.ubicacion.getX() - cantidadAvanzar);
					break;
			}
			
		}
		
		public void metodoPrueba() {
			int numero = 1;
			
			while (numero >= 0) {
				metodoPrueba();
				numero--;
			}
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
		
		public char girarDerecha() {
			
			switch (this.puntoCardinal) {
			
			case 'N' : this.puntoCardinal = 'E';
						break;
			case 'E' : this.puntoCardinal = 'S';
						break;
			case 'S' : this.puntoCardinal = 'O';
						break;
			case 'O' : this.puntoCardinal = 'N';
						break;
			}
			return this.puntoCardinal;
			
		}
		
		public char girarIzquierda() {
			
			switch (this.puntoCardinal) {
			
			case 'N' : this.puntoCardinal = 'O';
						break;
			case 'O' : this.puntoCardinal = 'S';
						break;
			case 'S' : this.puntoCardinal = 'E';
						break;
			case 'E' : this.puntoCardinal = 'N';
						break;
			}
			return this.puntoCardinal;
			
		}
		
	
}
