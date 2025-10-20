package semanacuatro;

public class Main {

	public static void main(String[] args) {

		Bicycle bicicleta1, bicicleta2, bicimad;
		int velocidadBici1, velocidadBicimad;
		
		// Para crear el objeto hay que llamar al constructor
		

		bicicleta1 = new Bicycle(1,2,3);
		bicicleta2 = new Bicycle();
		bicimad = new Bicycle (0,0,0);
		bicicleta1.applyBrake(8);
		bicicleta2.applyBrake(8);

		
		bicicleta2.setCadence(2);
		bicicleta1.setCadence(1);
		velocidadBici1 = bicicleta1.getSpeed();
		
		System.out.println(velocidadBici1);		
		
		bicimad.speedUp(5);
		
		velocidadBicimad = bicimad.getSpeed();
		
		System.out.println(velocidadBicimad);	
		
		bicimad.applyBrake(3);
		
		velocidadBicimad = bicimad.getSpeed();
		
		System.out.println(velocidadBicimad);
		
		System.out.println("IDs: ");
		
		System.out.println(bicicleta1.getID());
		System.out.println(bicicleta2.getID());
		System.out.println(bicimad.getID());
		

		

	}

}
