package personaEdad;

public class Main {

	public static void main(String[] args) {


		Persona persona1, persona2;
		
		persona1 = new Persona(23,false);
		persona2= new Persona(12);
		
		// persona1=persona2;
		
		persona1.mostrarDatos();
		persona2.mostrarDatos();
		
		// esto hace que funcione por probabilidad 40% si 60% no
		if (Math.random()<0.4) {
			
		} else {
			
		}

	}

}
