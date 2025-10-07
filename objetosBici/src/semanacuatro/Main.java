package semanacuatro;

public class Main {

	public static void main(String[] args) {

		Bicycle bicicleta1;
		Bicycle bicicleta2;
		
		// Para crear el objeto hay que llamar al constructor
		

		bicicleta1 = new Bicycle(1,2,3);
		bicicleta2 = new Bicycle();
		bicicleta1.applyBrake(8);

		System.out.println("Bicicleta 1 s,g,c");
		System.out.println(bicicleta1.speed);
		System.out.println(bicicleta1.gear);
		System.out.println(bicicleta1.cadence);
		System.out.println("Bicicleta 2 s,g,c");
		System.out.println(bicicleta2.speed);
		System.out.println(bicicleta2.gear);
		System.out.println(bicicleta2.cadence);
		

	}

}
