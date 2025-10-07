package semanacuatro;

public class Bicycle {
	// caracteristicas
	public int cadence;
	public int gear;
	public int speed;



// el nombre del constructor tiene que ser el mismo que el de la clase
	public Bicycle (int startCadence, int startSpeed, int startGear) {
		
		gear = startGear;
		cadence =startCadence;
		speed = startSpeed;
	
	}
	
	public Bicycle()  {
		
		cadence = 1;
		gear = 2;
		speed = 3;
	}
	
	public void setGear (int newValue) {
		gear = newValue;
	}
	
	public void applyBrake (int decrement) {
		speed -= decrement;
	}
	
	public void speedUp (int increment) {
		speed += increment;
	}
	
}

