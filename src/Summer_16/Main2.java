package Summer_16;

class Alpha {
	public void foo(String a) {
		System.out.println("Alpha:foo");
	}

	public void bar(String a) {
		System.out.println("Alpha:bar");
	}
}

public class Main2 extends Alpha {
	public void foo(String a[]) {
		System.out.println("Beta:foo");
	}

	public void bar(String a) {
		System.out.println("Beta:bar");
	}

	public static void main(String[] args) {
		Alpha a = new Main2();
		Main2 b = (Main2) a;
		a.foo("test");
		b.foo("test");
		a.bar("test");
		b.bar("test");
	}
}
