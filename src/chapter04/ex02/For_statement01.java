package chapter04.ex02;

public class For_statement01 {
	public static void main(String[] args) {
		/*
		반복문 : fore, while, do while (조건이 true 이면 반복) 
		*/
//		for ( int i = 0  ; i < 10 ; i++ ) {
//		System.out.println(i);
//		}
		
//		for ( int i = 10, j = 20 ; i < 100 ; i ++, j++ ) {
//			System.out.printf("i : %d, j= %d\n",i,j);
//		}
		
//		int b ;
//		for ( b = 0 ; b < 50 ; b += 2 ) {
//			System.out.print( b + " " );
//		}
//		System.out.println();
//		System.out.println(b);
//		
//		for ( int i = 0 ; i < 1000 ; i  += 3 ) {
//			if ( i != 0 ) System.out.print( i + " " );
//		}
		
		for (int i = 2 , j = 1 ; j < 10 ; j++) {
//			System.out.println( i + " * " + j + " = " + ( i * j ) );
			System.out.printf("%d * %d = %d\n",i,j,i*j);
		}
		
		
	}
	
}