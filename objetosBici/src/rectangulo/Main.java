package rectangulo;

public class Main {

	public static void main(String[] args) {
		
		Point punto1;
		Rectangle rectangulo1, rectangulo2;

		rectangulo1 = new Rectangle(new Point (3,4),6,7);
		punto1 = new Point(5,6);
		rectangulo2 = new Rectangle(punto1,6,7);
		
		System.out.println("x: "+ punto1.getX());
		System.out.println("y: "+ punto1.getY());
		rectangulo2 = new Rectangle(punto1,6,7);
		
		punto1.move(0, 0);
		
		System.out.println("Punto: "+ punto1);
		punto1.mostrarDatos();
		
		System.out.println("x: " + rectangulo2.getOrigin().getX());
		System.out.println("y: " + rectangulo2.getOrigin().getY());
		
		rectangulo2.move(1, 1);
		
		System.out.println("x: " + rectangulo2.getOrigin().getX());
		System.out.println("y: " + rectangulo2.getOrigin().getY());
		
	}

}
