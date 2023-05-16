package chapter07.ex02;
class B {
	// 매개변수로 배열 받아서 처리
	void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
public class Method02 {
	public static void main(String[] args) {
		B b1 = new B();
		int[] arr1 =new int[] {1,2,3,4,5,6,7,8,9,10};
		b1.print(arr1);
		
		B b2 = new B();
		b2.print(new int[] {10,20,30,40,50,60,70,80,90});
	}
}
