package chapter04.ex02;

import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		/*
		Scanner 로 정수 입력 받아 for 문을 이용해서 구구단 출력
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 수 입력 : ");
		int input = sc.nextInt();
		
		if ( input < 10 && input > 1 ) {
			for ( int i = 1 ; i < 10 ; i ++ ) {
				System.out.println(input + " * " + i + " = " + (input * i) );
			}
			
			for ( int i = 1 ; i < 10 ; i ++ ) {
				System.out.printf("%d * %d = %d\n", input, i, input * i );
			}
		}
		sc.close();
	}

}