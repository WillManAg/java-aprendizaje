package pokimon;

public class Main {

	public static void main(String[] args) {

		Pokimon pokimon1, pokimon2;
		boolean resultado;
		
		pokimon1 = new Pokimon(100, 10.0, 5.0,new Punto(8,9));
		pokimon2 = new Pokimon(100, 7.0, 7.0, new Punto(7,6));
		
		resultado = pokimon1.combatir(pokimon2);
		
		pokimon1.combatir(pokimon2);
	}

}
