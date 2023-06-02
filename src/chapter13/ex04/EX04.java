package chapter13.ex04;

import java.util.Set;
import java.util.TreeSet;

class Aa implements Comparable<Aa>{
	String name;
	
	Aa(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Aa o) {
//		return (this.name.compareTo(o.name));		// 오름차순
		return o.name.compareTo(this.name);			// 내림차순
	}
}

class Bb implements Comparable<Bb>{
	int userId;
	
	Bb(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return userId + "" ;
	}

	@Override
	public int compareTo(Bb o) {
		if (this.userId < o.userId) {
			return -1;
		}else if (this.userId == o.userId) {
			return 0;
		}else return 1;
//		return o.userId - this.userId;		// 내림차순
//		return this.userId - o.userId;		// 오름차순
	}
	
}

public class EX04 {
	public static void main(String[] args) {
		// 두 클래스를 TreeSet에 저장시 정렬되어 출력되도록 구현.
		Set<Aa> aaSet = new TreeSet<>();
		aaSet.add(new Aa("마"));
		aaSet.add(new Aa("나"));
		aaSet.add(new Aa("가"));
		aaSet.add(new Aa("라"));
		System.out.println(aaSet);
		
		Set<Bb> bbSet = new TreeSet<>();
		bbSet.add(new Bb(10));
		bbSet.add(new Bb(4));
		bbSet.add(new Bb(8));
		bbSet.add(new Bb(6));
		System.out.println(bbSet);
		
	}
}
