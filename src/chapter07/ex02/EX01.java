package chapter07.ex02;
class C {
	void print ( int[] a , double[] b) {
		// a 배열의 값 출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		
		// b 배열의 값 출력
		for (int i = 0; i < b.length; i++) {
			double d = b[i];
			System.out.println(d);
		}
	}
}
public class EX01 {
	public static void main(String[] args) {
		
		C c = new C();
		int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		c.print(arr1,new double[] {10,20,30,40,50,60,70});
		
	}
}
