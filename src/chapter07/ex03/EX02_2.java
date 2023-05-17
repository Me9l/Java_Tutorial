package chapter07.ex03;

public class EX02_2 {
	
	public static void arrSum(int[] a, int[] b) {
		
		int[] c = new int[71]; // a b 중 큰 배열의 크기만큼 할당.
		for (int i = 0, j= 0; i < a.length; i++, j++) { 	// i : a.length ( 0 ~ 70 ), j : b.length ( 0 ~ 54 )
			if (i >= b.length) {
				c[i] = a[i];
				System.out.println();
			} else {
			c[i] = a[i] + b[j];
			}
			System.out.print(c[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] a;
		int[] b;

		a = new int[500 / 7];
		b = new int[500 / 9];

		// 7의 배수 저장
		for (int i = 0, j = 7; i < a.length; i++) {
			a[i] = j;
			j += 7;
			System.out.print(a[i] + " ");
		}
		// a.length = 71
		System.out.println("\n a.length : " + a.length);

		// 9의 배수 저장
		for (int i = 0, j = 9; i < b.length; i++) {
			b[i] = j;
			j += 9;
			System.out.print(b[i] + " ");
		}
		// b.length = 55
		System.out.println("\n b.length : " + b.length);
		
		arrSum(a,b);
	}
}
