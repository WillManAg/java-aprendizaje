package semanacuatro;

public class Main {

	public static void main(String[] args) {

		Bicycle bicicleta1, bicicleta2;
		
		// Para crear el objeto hay que llamar al constructor
		

		bicicleta1 = new Bicycle(1,2,3);
		bicicleta2 = new Bicycle();
		bicicleta1.applyBrake(8);
		bicicleta2.applyBrake(8);
		System.out.println("Bicicleta 2 s,g,c");
		bicicleta2.setCadence(2);
		bicicleta1.setCadence(1);
		

	}

}
