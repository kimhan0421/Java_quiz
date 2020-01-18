package quiz06_01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

class Point implements Comparable<Point>{
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {return x;}

	public void setX(int x) {this.x = x;}

	public int getY() {	return y;}

	public void setY(int y) {this.y = y;}

	@Override
	public int compareTo(Point arg0) {
		if(this.x > arg0.x) {
			return 1;
		}else if(this.x == arg0.x) {
			return 0;
		}else {
			return -1;
		}
				
	}

	@Override
	public String toString() {
		return "Point [x="+x+", y="+y+"]";
	}
	
	
}
public class PointManager {
	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList <Point>();
		Random rd = new Random();
		int x,y;
		for(int i = 0; i<10 ;i++) {
			x = rd.nextInt(101);
			y = rd.nextInt(101);
			list.add(new Point(x,y));
		}
		for(Point point : list) {
			System.out.println(point);
		}
		System.out.println("====================");
		Collections.sort(list);
		for(Point point : list) {
			System.out.println(point);
		}
	}

}
