package chapter04.ex02;

public class EX04 {
	public static void main(String[] args) {
		/*
		  2중 for 문 사용해 구구단 출력
		*/
		
		for ( int i = 1; i < 10 ; i++ ) {
			System.out.println(i+" 단");
			for ( int j = 1 ; j < 10 ; j++ ) {
				System.out.printf( "%d * %d = %d\t", i, j, i*j );
			}
			System.out.println();
		}
	}
}
