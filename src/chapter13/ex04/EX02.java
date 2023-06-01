package chapter13.ex04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
	int stuId;
	String stuName, StuPhone;
	
	public Student(int stuId, String stuName, String stuPhone) {
		this.stuId = stuId;
		this.stuName = stuName;
		StuPhone = stuPhone;
	}

	@Override
	public String toString() {
		return "[stuId=" + stuId + ", stuName=" + stuName + ", StuPhone=" + StuPhone + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			if (this.stuId == ((Student)obj).stuId) {
				return true;
			}
		}return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(stuId);
	}
	
}


public class EX02 {
	public static void main(String[] args) {
		// 학생 Entity 5개 생성.
		// Set에 넣을 경우, stuId필드에 중복된 값을 넣지 못하도록 설정.
		// equals(), hashCode() 재정의
		
		
		// 객체생성
		Student s1 = new Student(0, "고길동", "001");
		Student s2 = new Student(1, "홍길동", "002");
		Student s3 = new Student(2, "박보검", "003");
		Student s4 = new Student(3, "이순신", "004");
		Student s5 = new Student(1, "안중근", "005");
		Student s6 = new Student(3, "파이썬", "006");
		Student s7 = new Student(4, "댕댕이", "007");

		// Set에 student 객체 입력.
		Set<Student> hSet = new HashSet<>();
		hSet.add(s1);
		hSet.add(s2);
		hSet.add(s3);
		hSet.add(s4);
		hSet.add(s5);
		hSet.add(s6);
		hSet.add(s7);
		
		// 객체 출력
		for (Student student : hSet) {
			System.out.println(student);			
		}
	}
}
