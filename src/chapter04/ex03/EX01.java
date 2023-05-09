package chapter04.ex03;

public class EX01 {
	public static void main(String[] args) {
		/*
		1000 ~ 1 까지 5씩 감소 하면서 출력 
		*/
		
//		for
		
		int count = 0 ;
		for ( int i = 1000 ; i >= 1 ; i -= 5 ) {
			if ( count % 10 == 0 ) {
				System.out.println();
			}
			System.out.print(i+"\t");
			count++;
		}
		
		System.out.println();
		
//		while
		int a = 1000 ;
		while ( a >= 1 ) {
			System.out.println(a);
			a-=5;
		}
	}
}
