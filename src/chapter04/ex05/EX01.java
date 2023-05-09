package chapter04.ex05;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-------------------------------------------");
			System.out.println("1. 1 ~ 20 까지 홀수를 차례대로 출력");
			System.out.println("2. 10 이하의 정수를 입력받아 정수만큼 \"Java\" 를 출력");
			System.out.println("3. 10 개의 정수를 입력받아 그 수들 중 짝수가 몇개 인지 출력");
			System.out.println("4. 입력받은 정수 만큼 성적을 입력 받아 총점과 평균을 출력");
			System.out.println("5. 프로그램 종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 >>>>>>>>>>>>>>>>>>>>>>>>> ");
			input = sc.nextInt();

			if (input == 1) {
				System.out.println("1번 선택 > 1 ~ 20 까지의 홀수를 출력합니다.");
				for (int i = 1; i <= 20; i++) {
					if (i % 2 != 0) {
						System.out.print("[" + i + "]");
					}
				}
				System.out.println("\n");
			} else if (input == 2) {
				System.out.print("2번 선택 > 10 이하의 정수를 입력하세요. ");
				input = sc.nextInt();
				if (input <= 10) {
					System.out.printf(">>> %d 입력. 입력값 만큼 JAVA를 출력합니다.\n", input);
					for (int i = 1; i <= input; i++) {
						System.out.println("[" + i + "] JAVA");
					}
					System.out.println();
				} else System.out.println("잘못된 입력.");
			} else if (input == 3) {
				System.out.println("3번 선택 > 10개의 정수를 입력 받아 짝수의 갯수를 구합니다.");
				int count = 0;
				for (int i = 0 ; i < 10 ; i ++ ) {
					System.out.print(">>> "+(i+1)+"번 째 정수 입력 : ");
					input = sc.nextInt();
					if ( input % 2== 0 ) {
						count++;
					}
				}
				System.out.printf(">>> 입력한 값 중 짝수는 [%d] 개 입니다.\n\n",count);
			} else if (input == 4) {
				System.out.print("4번 선택 > 과목 수 만큼 정수를 입력하세요. ");
				input = sc.nextInt();
				System.out.printf(">>> [%d] 개의 과목을 입력합니다.\n", input);
				int sum = 0 ;
				double avg ;
				for ( int i = 0 ; i < input ; i ++ ) {
					System.out.printf("[%d]번째 과목의 점수를 입력하세요 : ",i+1);
					sum += sc.nextInt();
				}
				avg = sum / input ;
				System.out.printf("[%d]개의 과목의 총점 : %d 점, 평균 : %.2f 점\n ",input,sum,avg);
			} else if (input == 5) {
				System.out.println("5번 선택 > 프로그램 종료 .. ."); break ;
			} else
				System.out.println("> 잘못된 입력. 다시 시도 하세요.");

		} while (input != 5);
		sc.close();
	}
}
