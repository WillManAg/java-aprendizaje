package basket;

public class Main {

	public static void main(String[] args) {
		
		Jugador jugador1, jugador2;
		
		jugador1 = new Jugador();
		jugador2 = new Jugador(2.07, 98,1);
	
		
		if (jugador1.lanzarDeDos()) {
			System.out.println("J1 de 2: Canasta");
		} else {
			System.out.println("J1 de 2: Falla");
		}
		
		if (jugador2.lanzarDeDos()) {
			System.out.println("J2 de 2: Canasta");
		} else {
			System.out.println("J2 de 2: Falla");
		}


		if (jugador1.lanzarDeTres()) {
			System.out.println("J1 de 3: Canasta");
		} else {
			System.out.println("J1 de 3: Falla");
		}
		
		if (jugador2.lanzarDeTres()) {
			System.out.println("J2 de 3: Canasta");
		} else {
			System.out.println("J2 de 3: Falla");
		}

		
		
	}

}
