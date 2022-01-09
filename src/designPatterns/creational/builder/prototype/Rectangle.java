package designPatterns.creational.builder.prototype;

public class Rectangle extends Shape {

	public Rectangle(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Rectangle - Width: " + width + " | " + "Height: " + height);
	}

	@Override
	public Shape clone() {
		return new Rectangle(width, height);
	}
}
