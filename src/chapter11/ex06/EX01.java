package chapter11.ex06;

class A0 {
	
}
class B extends A0 {
	
}
class C extends A0 {
	
}

public class EX01 {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		try {
			System.out.println(arr[5]);			
		} catch (Exception e) {
			System.out.println(e);
		}
	
		A0 a1 = new B();
		try {
			C c1 = (C)a1;
			System.out.println(c1);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("===  마지막 라인  ===");
	}
		
}
