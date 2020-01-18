package quiz06_01;

import java.util.HashMap;
import java.util.Scanner;

class Student{
	private String name;
	private String department;
	private String stuNo;
	public Student(String name, String department, String stuNo) {
		this.name = name;
		this.department = department;
		this.stuNo = stuNo;
	}
	public String getName() {return name;}
	public String getDepartment() {return department;}
	public String getStuNo() {return stuNo;}
}

public class StudentManager {

	public static void main(String[] args) {
		HashMap<String, Student> stuMap = new HashMap<String, Student>();
		Scanner sc = new Scanner(System.in);
		String name, dept, stuNo;
		Student stu;
		System.out.println("�л� 5���� ���� �Է� >> ");
		for(int i = 0; i<5;i++) {
			System.out.println((i+1)+"��° �л��� �̸�:");
			name = sc.next();
			System.out.println((i+1)+"��° �л��� �а�:");
			dept = sc.next();
			System.out.println((i+1)+"��° �л��� �й�:");
			stuNo = sc.next();
			stu = new Student(name, dept, stuNo);
			stuMap.put(stuNo, stu);// ��ü�� ����. �й�+�л�����
		}
		
		while(true) {
			System.out.println("�л��� �˻��Ϸ��� �й���, �����Ϸ��� q�Է�");
			stuNo = sc.next();
			if(stuNo.equals("q")) {
				System.out.println("����");
				System.out.println(0);
			}
			stu = stuMap.get(stuNo);//hashmap ��ü���� ����
			if(stu != null) {
				System.out.println("---------");
				System.out.println("�̸�: " +stu.getName());
				System.out.println("�а�: " +stu.getDepartment());
				System.out.println("�й�: " +stu.getStuNo());
				System.out.println("---------");				
			}else {
				System.out.println("�ش��ϴ� �л��� ����");
			}
		}

	}

}
