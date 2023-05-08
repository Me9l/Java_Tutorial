package chapter04.ex01;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		/*
		Scanner 로 money 인풋.
		0 ~ 3000 : 걷기
		3001 ~ 30000 : 대중교통
		30001 ~ 100000 : 택시
		100001 ~ : 비행기
		*/
		int money ;
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		money = sc.nextInt();
		sc.close();
		
		if ( money > 100000 ) {
			System.out.println("비행기");
		} else if ( money <= 100000 && money > 30000 ) {
			System.out.println("택시");
		} else if ( money <= 30000 && money > 3000 ) {
			System.out.println("대중교통");
		} else System.out.println("걷기");

	}

}
