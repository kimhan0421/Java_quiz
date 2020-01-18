package quiz06_01;

import java.util.*;

public class GraphiEditor {
	ArrayList<GraphicObject> shapes = new ArrayList<GraphicObject>();

	void add(GraphicObject ob) {
		shapes.add(ob);
	}
	void draw() {
		for( GraphicObject ob : shapes) {
			ob.view();
		}
	}
	public static void main(String[] args) {
		GraphiEditor g = new GraphiEditor ();
		
		g.add(new Rect(2, 2, 4, 4));
		g.add(new Line(3, 3, 8, 8));
		g.add(new Rect(4, 6, 0, 0));
		g.add(new Line(2, 5, 6, 6));
		g.draw();
		
	}
	
}

abstract class GraphicObject {
	protected int x1, y1, x2, y2;

	public GraphicObject(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public abstract void view();
}

class Line extends GraphicObject {

	public Line(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
	}

	@Override
	public void view() {
		System.out.println("("+ x1 + y1 +")->("+ x2 + y2 +")의 선");
	}
}

class Rect extends GraphicObject {
	private int width, height;

	public Rect(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
		calcWidthHeight();
		
	}

	private void calcWidthHeight() {
		width = Math.abs(x1 - x2);
		height = Math.abs(y1 - y2);
	}

	@Override
	public void view() {
		System.out.println("("+ x1 + y1 +")->("+ x2 + y2 +")," + width +"x"+height+"의 사각형");

	}
}


