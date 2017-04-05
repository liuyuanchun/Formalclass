package day6;

public class GraphicsTest {
	public static void main(String[] args) {
		Graphics graphics1 = new Square(5);
		graphics1.draw();
		 graphics1 = new Rectangle(5,3);
		graphics1.draw();
		Graphics graphics3 = new Circle(5);
		graphics3.draw();
	}
}
