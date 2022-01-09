package designPatterns.creational.prototype;

public class App {

	private static void squareExample() {
		Shape square = new Square(10, 10);
		square.draw();

		Shape squareClone = square.clone();
		squareClone.draw();
	}

	private static void rectangleExample() {
		Shape rectangle = new Rectangle(10, 5);
		rectangle.draw();

		Shape rectangleClone = rectangle.clone();
		rectangleClone.draw();
	}

	public static void main(String[] args) {
		squareExample();
		rectangleExample();
	}

}
