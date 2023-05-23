package chapter09.ex05;
class E {
	E(){
		this(3);
		System.out.println("E constructor()");
	}
	E(int a) {
		System.out.println(a);
		System.out.println("E constructor(int a)");
	}
}

class F extends E {
	F(){
		this(5);
		System.out.println("F constructor()");
	}
	F(int a) {
		System.out.println(a);
		System.out.println("F constructor (int a)");
	}
}

public class Super_Method02 {
	public static void main(String[] args) {
		F f = new F();
	}

}
