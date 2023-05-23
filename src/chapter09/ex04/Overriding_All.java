package chapter09.ex04;

class C {
	int m = 3;
	static int n = 30;
	
	void p() {
		System.out.println("class C - p()");
	}
	
	static void staticP() {
		System.out.println("class C - staticP()");
	}
}

class D extends C {
	int m = 4;
	static int n = 40;
	
	void p() {
		System.out.println("class D - p()");
	}
	
	static void staticP() {
		System.out.println("class D - staticP()");
	}
}

public class Overriding_All {
	public static void main(String[] args) {
		C c1 = new D();
		System.out.println(c1.m);
		System.out.println(c1.n);
		c1.staticP();
		c1.p();
		
		D d1 = (D) c1;
		System.out.println(d1.m);
		System.out.println(d1.n);
		d1.p();
		d1.staticP();
	}
}