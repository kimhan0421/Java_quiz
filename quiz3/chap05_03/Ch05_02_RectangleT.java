package chap05_03;

class Shape{
	private int x, y;
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void print() {
		System.out.printf("(%d ,%d)",x,y);
	}
}

class Rectangle extends Shape{
	private int width, height;
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height=height;
	}
	public Rectangle(int x, int y) {
		super(x,y);
	}
	public double area() {
		return width* height;
	}
	public void draw() {
		print();
		System.out.println(width + height);
	}
}

public class Ch05_02_RectangleT {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,3,10,20);
		Rectangle r2 = new Rectangle(8,9,10,20);
		r1.draw();

	}

}
