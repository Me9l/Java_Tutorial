package chapter09.ex05;

class AAA {
	AAA(){
		System.out.println("AAA 기본 생성자");
	}
}
class BBB extends AAA{
	BBB(){
		System.out.println("BBB 기본 생성자");
	}
}
class CCC {
	CCC (int a) {
		System.out.println(a);
		System.out.println("C 생성자 호출");
	}
}
class DDD extends CCC {
	DDD () {
		super(3);
		System.out.println("D 생성자 호출");
	}
}

public class Super_Method {
	public static void main(String[] args) {
		BBB bbb = new BBB();
		DDD ddd = new DDD();
	}
}
