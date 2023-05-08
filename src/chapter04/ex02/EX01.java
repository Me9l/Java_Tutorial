package chapter04.ex02;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		/*
		1. Scanner 로 1,2,3 input
			1:금메달,2:은메달,3:동메달 그외: 메달없음
		2. Scanner 로 String "gold", "silver", "bronze"
			"gold":금메달,"silver":은메달,"bronze":동메달 그외: 메달없음
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("[1 : 금메달 , 2 : 은메달 , 3 : 동메달 ] 입력 : ");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			System.out.println("금메달.");
			break;
		case 2:
			System.out.println("은메달.");			
			break;
		case 3:
			System.out.println("동메달.");
			break;
		default:
			System.out.println("없음");
			break;
		}		
		System.out.print("[ gold, silver, bronze ] 입력 : ");
		String medal = sc.next();
		switch (medal) {
		case "gold": case "Gold" : case "GOLD" :
			System.out.println("금메달.");
			break;
		case "silver":
			System.out.println("은메달.");						
			break;
		case "bronze":
			System.out.println("동메달.");
			break;
		default:
			System.out.println("없음.");
			break;
		}
	}

}