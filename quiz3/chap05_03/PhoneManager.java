package chap05_03;

import java.util.Scanner;

class Phone {
	private String name, tel;

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

}

public class PhoneManager {
	Scanner sc ;
	Phone[] phone;

	PhoneManager() {
		//sc = new Scanner(System.in);
	}

	void read() {
		System.out.println("�ο���>>");
		int numb = sc.nextInt();
		phone = new Phone[numb];
		for (int i = 0; i < numb; i++) {
			System.out.println("�̸�, ��ȭ��ȣ �Է�>>");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
		}
	}

	String search(String name) {
		for (int i = 0; i < phone.length; i++) {
			if (phone[i].getName().equals(name)) {
				return phone[i].getTel();
			}
		}
		return null;
	}

	void run() {
		read();
		while (true) {
			System.out.println("�˻� �̸�>>");
			String name = sc.next();
			if (name.equals("exit")) {
				break;
			}
			String tel = sc.next();
			if (tel == null) {
				System.out.println(name + "����");
			} else {
				System.out.println(name + "��ȣ" + tel + "�̴�");

			}

		}
	}

	public static void main(String[] args) {
		new PhoneManager().run();

	}

}
