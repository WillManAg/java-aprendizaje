package rectangulo;

public class Rectangle {
	public int width = 0;
	public int height = 0;
	public Point origin;
	
	public Rectangle() {
		origin = new Point(0, 0);
	}
	
	public Rectangle(Point p) {
		origin = p;
	}
	
	public Rectangle (int w, int h) {
		origin = new Point(0, 0);
		width = 0;
		height = h;
	}
	
	public Rectangle(Point p, int w, int h) {
		origin = new Point(p.getX(), p.getY());
		width = w;
		height = h;
	}

	public void move (int x, int y) {
		// origin.x = x;
		// origin.y = y;
		this.origin.move(x, y);
	}
	
	public Point getOrigin() {
		return origin;
	}

	public int getArea() {
		return width * height;
	}
}
