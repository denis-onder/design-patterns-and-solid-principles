package designPatterns.creational.prototype;

public class Square extends Shape {

	public Square(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Square - Width: " + width + " | " + "Height: " + height);
	}

	@Override
	public Shape clone() {
		return new Square(width, height);
	}
}
