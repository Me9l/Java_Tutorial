package chapter07.ex03;

public class EX02 {

	// 두 배열 각 인덱스 값을 더해서 출력
	public static void arrSum (int[] a, int[] b) {
		for (int i = 0 ; true ; i++) {
			if (i >= a.length || i >= b.length) break;
			System.out.println(a[i]+b[i] +", " + i);
		}
	}
	
	public static void main(String[] args) {
	
		int[] a ;		// a : 500 이하 7의 배수
		int[] b ;		// b : 500 이하 9의 배수
		
		a = new int[500/7];
		b = new int[500/9];
		for (int i = 7, j = 9, c = 0 ; true ; i+=7, j+=9 ) {
			if ( i > 500 || j > 500 ) break;
			a[c] = i;
			b[c] = j;
//			System.out.println(a[c] + ", " + b[c]);
			c++;
		}
		
		arrSum(a,b);
	}
}
