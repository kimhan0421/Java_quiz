package Summer_16;

class Parent {
	String name;

	Parent() {
		name = "영조";
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
		name = "사도세자";
	}

	public Child(String name) {
		this.name = name;
	}

	void print() {
		System.out.println("나는 " + name + "이다.");
	}

}

public class Main {
	public static void main(String[] args) {
		Parent p = new Child();
		p.print();
		System.out.println(p.name);
	}
}