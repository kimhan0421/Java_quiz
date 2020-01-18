package Summer_16;

class Parent {
	String name;

	Parent() {
		name = "����";
	}

	public Parent(String name) {
		this.name = name;
	}

	void print() {
		System.out.println(name);
	}
}

class Child extends Parent {
	String name;

	Child() {
		name = "�絵����";
	}

	public Child(String name) {
		this.name = name;
	}

	void print() {
		System.out.println("���� " + name + "�̴�.");
	}

}

public class Main {
	public static void main(String[] args) {
		Parent p = new Child();
		p.print();
		System.out.println(p.name);
	}
}