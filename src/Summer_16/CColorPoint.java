package Summer_16;

class CPoint {
	private int x, y;

	public CPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

}

public class CColorPoint extends CPoint {
	private String color;

	public CColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String toString(){
		  return super.toString() + color;
	}

	

	public static void main(String[] args) {
		CPoint a;
		a = new CPoint(2, 3);
		System.out.println(a);
		a = new CColorPoint(3, 4, "red");
		System.out.println(a);
	}
}