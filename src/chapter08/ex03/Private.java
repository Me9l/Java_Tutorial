package chapter08.ex03;

class Student {	// default 외부패키지에서 접근 불가.
	
	// 외부 접근이 불가능한 필드.
	private String sName;
	private String sAddr;
	private int sAge;
	private double sWeight;
	
	// getter, setter 를 사용해 private 필드 값을 제어.
	// private 필드에 값 넣기 (setter)
	// private 필드의 값 불러오기 (getter)
	
	// sName getter : 빌드 값 리턴
	public String getsName() {
		return sName;
	}
	// sName setter : 필드 값을 외부에서 제어
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public String getsAddr() {
		return sAddr;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}
	
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	
	public double getsWeight() {
		return sWeight;
	}
	public void setsWeight(double sWeight) {
		this.sWeight = sWeight;
	}
	
}

public class Private {

	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.sName = "TimCook";			// private 필드에 직접 접근 불가.
		s1.setsName("TimCook");
		System.out.println(s1.getsName());	//setter 와 getter를 통해 접근.
		
		s1.setsAddr("Seoul");
		s1.setsAge(18);
		s1.setsWeight(80.6);
		
		System.out.println(s1.getsAddr());
		System.out.println(s1.getsAge());
		System.out.println(s1.getsWeight());
	}

}
