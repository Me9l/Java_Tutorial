package chapter13.ex05;

import java.util.Map;
import java.util.Objects;
import java.util.LinkedHashMap;

class Student {
	/* 
	 * Map : Key
	 * equals(), hashCode() override (key의 중복을 방지하기위해 메소드 오버라이드)
	*/
	
	int stuId;		// key 로 사용할 값.
	String stuName;	// value 로 사용할 값.

	public Student(int stuId) {
		this.stuId = stuId;
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
		return Objects.hashCode(stuId);
	}

	@Override
	public String toString() {
		return stuId +"";
	}	
	
}

public class EX01 {

	public static void main(String[] args) {
		Map<Student,String> lhMap = new LinkedHashMap<>();
		lhMap.put(new Student(0), "조철봉");
		lhMap.put(new Student(1), "홍길동");
		lhMap.put(new Student(0), "조팔봉");
		lhMap.put(new Student(3), "엄복동");
		lhMap.put(new Student(2), "고길동");
		System.out.println(lhMap);
	}

}
