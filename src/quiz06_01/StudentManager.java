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
		System.out.println("학생 5명의 정보 입력 >> ");
		for(int i = 0; i<5;i++) {
			System.out.println((i+1)+"번째 학생의 이름:");
			name = sc.next();
			System.out.println((i+1)+"번째 학생의 학과:");
			dept = sc.next();
			System.out.println((i+1)+"번째 학생의 학번:");
			stuNo = sc.next();
			stu = new Student(name, dept, stuNo);
			stuMap.put(stuNo, stu);// 객체에 삽입. 학번+학생정보
		}
		
		while(true) {
			System.out.println("학생을 검색하려면 학번을, 종료하려면 q입력");
			stuNo = sc.next();
			if(stuNo.equals("q")) {
				System.out.println("종료");
				System.out.println(0);
			}
			stu = stuMap.get(stuNo);//hashmap 객체에서 꺼냄
			if(stu != null) {
				System.out.println("---------");
				System.out.println("이름: " +stu.getName());
				System.out.println("학과: " +stu.getDepartment());
				System.out.println("학번: " +stu.getStuNo());
				System.out.println("---------");				
			}else {
				System.out.println("해당하는 학생이 없음");
			}
		}

	}

}
