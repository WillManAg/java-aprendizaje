package semanacuatro;

public class Bicycle {
	// caracteristicas
	 private int cadence;
	    private int gear;
	    private int speed;
	    private int id;
	    private static int numberOfBicycles = 0;
	        
	    public Bicycle(int startCadence, int startSpeed, int startGear){
	        gear = startGear;
	        cadence = startCadence;
	        speed = startSpeed;

	        // increment number of Bicycles
	        // and assign ID number
	        id = ++numberOfBicycles;
	    }

	    // new method to return the ID instance variable
	    public int getID() {
	        return id;
	    }
	
	public Bicycle()  {
		
		cadence = 1;
		gear = 2;
		speed = 3;
		id = ++numberOfBicycles;
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

