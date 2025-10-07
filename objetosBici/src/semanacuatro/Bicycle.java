package semanacuatro;

public class Bicycle {
	// caracteristicas
	private int cadence;
	private int gear;
	private int speed;



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
	
	
	
	public int getSpeed() {
		return this.speed;
	}
	
	

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public void applyBrake (int decrement) {
		speed -= decrement;
	}
	
	public void speedUp (int increment) {
		speed += increment;
	}
	
}

