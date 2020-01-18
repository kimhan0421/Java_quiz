package quiz07;

import java.util.HashMap;
import java.util.Scanner;

class Student {
	private String name, department, stuNo;

	public Student(String name, String department, String stuNo) {
		this.name = name;
		this.department = department;
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getStuNo() {
		return stuNo;
	}

}

public class StudentManager {

	public static void main(String[] args) {
		HashMap<String, Student> stuMap = new HashMap<String, Student>();
		Scanner sc = new Scanner(System.in);
		String name, dept, stuNo;
		Student stu ;
		System.out.println("학생 5명 정보 입력>> ");
		for(int i = 0; i<5;i++) {
			System.out.println((i+1)+"번째 학생의 이름");
			name = sc.next();
			System.out.println((i+1)+"번째 학생의 학과");
			dept = sc.next();
			System.out.println((i+1)+"번째 학생의 학번");
			stuNo = sc.next();
			
			stu = new Student(name, dept, stuNo);
			stuMap.put(stuNo, stu);
		}
		while (true) {
			System.out.println("학생 검색 시 학번, 종료시 q");
			stuNo = sc.next();
			if(stuNo.equals("q")) {
				System.out.println("종료");
				System.out.println(0);
			}
			stu = stuMap.get(stuNo);
			if(stuNo != null) {
				System.out.println("========");
				System.out.println("이름: " + stu.getName());
				System.out.println("학과: " + stu.getDepartment());
				System.out.println("학번: " + stu.getStuNo());
			}else {
				System.out.println("해당 없음.");
			}
		}

	}

}
