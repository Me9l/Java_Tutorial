package chapter04.ex02;

public class EX05 {
	public static void main(String[] args) {
		/*
		1. 이중 for문을 사용해 1 ~ 19 단 출력
		2. 이중 for문을 사용해 1 ~ 19 단 중 3의 배수 단만 출력
		*/
		
		System.out.println("= 1단 ~ 19단 =");
		
		for (int i = 1; i < 20; i++) {
			System.out.println("= ["+i+"] 단 = ");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
			}
		}
		
		//////////////////////////////////////////////////////
		
		System.out.println("1~19 단 중 3의 배수 단");

		for (int i = 1; i < 20; i++) {
			if ( i % 3 == 0 ) {
			System.out.println("= ["+i+"] 단 = ");
				for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
				}
			}
		}
		
		
		
		System.out.println("1~19 단 중 3의 배수 단");
		
		for (int i = 1; i < 20; i++) {
			if ( i % 3 != 0 ) { continue ; }
				System.out.println("= ["+i+"] 단 = ");
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %d\n",i,j,(i*j));
				}
			}
		}
		
		
	}

