package FT;

import java.util.Comparator;

class Student implements Comparable<Student> {
	String name;
	int ban, no, kor, eng, math;
	int total, schoolRank, classRank;

	public Student(String name, int ban, int no, int kor, int eng, int math, int total) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;

	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class ClassTotal implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		int result = s1.ban - s2.ban;
		if (result == 0) {
			result = s2.total - s1.total;
		}
		return result;
	}

}
