package chapter06.ex01;

class Student2 {
	// field
	String name, addr, email;
	int age ;
	
	//method
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + email);
	}
}

public class Object06 {
	public static void main(String[] args) {
		// 객체 kim : 김길동/20/서울/aaa@aaa.com
		// 객체 lee : 이순신/30/부산/bbb@bbb.com
		// 객체 hong : 홍길동/35/대구/ccc@ccc.com
		
		// 각 객체의 필드 값 입력 후, 배열에 넣어 저장 후 출력.
		
		Student2 kim = new Student2();
		kim.name = "김길동";
		kim.addr = "서울";
		kim.age = 20;
		kim.email = "aaa@aaa.com";
		
		Student2 lee = new Student2();
		lee.name = "이순신";
		lee.addr = "부산";
		lee.age = 30;
		lee.email = "bbb@bbb.com";
		
		Student2 hong = new Student2();
		hong.name = "홍길동";
		hong.addr = "대구";
		hong.age = 35;
		hong.email = "ccc@ccc.com";
		
		Student2[] arr1 = new Student2[] {kim,lee,hong};	//kim 객체의 heap 주소값을 arr1[0]에 저장.
		
		System.out.println(kim);
		System.out.println(arr1[0]);	// 두 주소값이 같은것을 확인 할 수 있다.
		
		arr1[0].print();
		arr1[1].print();
		arr1[2].print();
		
		/////////////////////////////////////
		
		Student2 s1 = arr1[0];
		Student2 s2 = arr1[1];
		Student2 s3 = arr1[2];
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
//		s1.print();
//		s2.print();
//		s3.print();
	}
}
