package pokimon;

public class Punto {

	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public Punto() {
		this.x = 1;
		this.y = 1;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void mover(int x, int y ) {
		
		this.setX(x);
		this.setY(y);
		
	}
	
	public void mostrarDatos() {
		
		System.out.println("x: " + this.x);
		System.out.println("y: " + this.y);
		
	}

}
