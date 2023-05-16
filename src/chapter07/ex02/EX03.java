package chapter07.ex02;

class E {
	// a = int array, b = int.
	// 각 배열의 수를 b로 곱해서 출력.
	
	void print ( int[] a , int b ) {
		for (int i = 0; i < a.length; i++) {
//			int[] j = new int[a.length];
//			j[i] = a[i];
//			System.out.println(j[i]*b);
			int j = a[i];
			System.out.printf("배열값 : %d , b값 : %d, 곱 : %d\n",j,b,j*b);
		}
	}
}

public class EX03 {
	public static void main(String[] args) {
		E e = new E();
		int[] a = new int [] {2,3,5,7,9};
		int b = 3;
		e.print(a, b);
	}
}
