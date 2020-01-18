package chap05;

import java.util.Scanner;


abstract class Calc {
	protected int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b=b;
	}

	public abstract int calcuate();
}

class Add extends Calc {
	public int calcuate() {return a + b;}
}

class Mul extends Calc {

	public int calcuate() {return a * b;}
}

class Sub extends Calc {

	public int calcuate() {return a - b;}
	
}

class Div extends Calc {

	public int calcuate() {
		return a / b;
	}
}

public class Calculator {
	public static void main(String args[]) {
		Scanner sin = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sin.nextInt();
		int b = sin.nextInt();
		char operator = sin.next().charAt(0);
		Calc calc = null;
		switch (operator) {
		case '+':
			calc = new Add();
			break;
		case '-':
			calc = new Sub();
			break;
		case '*':
			calc = new Mul();
			break;
		case '/':
			calc = new Div();
			break;
		default:
			System.out.println("잘못된􀀁연산자입니다.");
		}
		if (calc != null) {
			calc.setValue(a, b);
			System.out.println(calc.calcuate());
		}
	}

}
