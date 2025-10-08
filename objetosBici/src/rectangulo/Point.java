package rectangulo;

public class Point {
		public int x = 0;
		public int y = 0;
		
		public Point(int a, int b) {
			x = a;
			y = b;
		}
		
		public void move (int x, int y) {
			this.x = x;
			this.y = y;
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

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		
		public void mostrarDatos() {
			System.out.println("x: " + this.getX());
			System.out.println("y: " + this.getY());
		}
		
}

