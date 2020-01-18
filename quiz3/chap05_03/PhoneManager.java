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
		System.out.println("인원수>>");
		int numb = sc.nextInt();
		phone = new Phone[numb];
		for (int i = 0; i < numb; i++) {
			System.out.println("이름, 전화번호 입력>>");
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
			System.out.println("검색 이름>>");
			String name = sc.next();
			if (name.equals("exit")) {
				break;
			}
			String tel = sc.next();
			if (tel == null) {
				System.out.println(name + "없다");
			} else {
				System.out.println(name + "번호" + tel + "이다");

			}

		}
	}

	public static void main(String[] args) {
		new PhoneManager().run();

	}

}
