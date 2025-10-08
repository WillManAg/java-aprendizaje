package rectangulo;

public class Main {

	public static void main(String[] args) {
		
		Point punto1;
		Rectangle rectangulo1, rectangulo2;

		rectangulo1 = new Rectangle(new Point (3,4),6,7);
		punto1 = new Point(5,6);
		rectangulo2 = new Rectangle(punto1,6,7);
		
		System.out.println(rectangulo1);
		System.out.println(rectangulo2);
		System.out.println(punto1);

	}

}
