package chap05_03;

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public String toString() {
		return "radius=" + radius;
	}
}

class Named extends Circle {
	private String name;

	public Named(int radius, String name) {
		super(radius);
		this.name = name;
	}

	public String toString() {
		return super.toString() +","+ "name = "+name;
	}
}

public class C05_01_2 {

	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		Circle c2 = new Named(5, "W");
		System.out.println(c1);
		System.out.println(c2);
	}

}
