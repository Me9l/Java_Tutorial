package chapter04.ex02;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		/*
			월 input 받기 ( 1 ~ 12 정수 )
			해당 월 일수 출력.
			1,3,5,7,8,10,12 = 31일
			4,6,9,11 = 30일
			2 = 28 일
		*/
		Scanner sc = new Scanner(System.in) ;
		System.out.print("월 입력 : ");
		int m = sc.nextInt() ;
		int d = 30 ;
		
		switch (m) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
				d += 1;
//				System.out.printf("입력 : [%d월] 은 [%d일]까지 있습니다.",m,d);
				break;
			case 2 :
				d -= 2;
//				System.out.printf("입력 : [%d월] 은 [%d일]까지 있습니다.",m,d);
				break;
			case 4 : case 6 : case 9 : case 11 :
//				System.out.printf("입력 : [%d월] 은 [%d일]까지 있습니다.",m,d);
				break;
			default :
//				System.out.println("잘못된 입력.");
				break;
		}
			System.out.printf("\n입력 : [%d월] 은 [%d일]까지 있습니다.",m,d);
		
		sc.close();
	}
}
