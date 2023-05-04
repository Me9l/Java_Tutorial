package chapter03.ex06;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
//		Q1 > 삼항연산자를 사용해 스케너로 받은 정수 값의 [홀/짝] 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		int inp = sc.nextInt();
		sc.close();
		System.out.printf( (inp % 2 == 0) ? "입력값 : %d [짝수]\n" : "입력값 : %d [홀수]\n" ,inp);
//		Q2 > 입력 받은 값이 3, 6, 9 의 배수이면 3, 6, 9의 배수 출력
		
		System.out.print( (inp%3==0) ? "3의 배수" : "" );
	}

}
