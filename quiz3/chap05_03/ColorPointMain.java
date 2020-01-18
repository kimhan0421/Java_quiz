package chap05_03;

class Point {
	protected int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		 super(x, y);
		this.color = color;
	}

	void showColorPoint() {
		//System.out.print(color);
		showPoint();
	}
}

public class ColorPointMain {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}

}
