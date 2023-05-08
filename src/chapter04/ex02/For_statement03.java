package chapter04.ex02;

public class For_statement03 {
	public static void main(String[] args) {
//			이중 for 문
		for ( int i = 2 ; i < 10 ; i++ ) {
			System.out.println("-= [" + i + "] 단 =-");
			for ( int j = 1 ; j < 10 ; j++ ) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		System.out.println("-=========-");
	}
}
