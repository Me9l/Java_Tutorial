package chapter04.ex04;

import java.util.Scanner;

public class EX01 { // ctrl + shift + f = 코드 정렬
	public static void main(String[] args) {
		int input;
		do {
			System.out.println("============================================================");
			System.out.println("1. 구구단 | 2. 19단 출력 | 3. 19단 중 7의 배수 단 출력 | 4. 프로그램 종료");
			System.out.println("============================================================");
			System.out.print("기능 선택 : >>>>> ");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();

			if (input == 1) {
				System.out.println("1. 구구단 < 선택");
				for (int i = 2; i < 10; i++) {
					System.out.printf("[%d]단\n", i);
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d X %d = %d\n", i, j, i * j);
					}
					System.out.println("==========");
				}
			}

			else if (input == 2) {
				System.out.println("2. 19단 < 선택");
				for (int i = 2; i < 20; i++) {
					System.out.printf("[%d]단\n", i);
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d X %d = %d\n", i, j, i * j);
					}
					System.out.println("==========");
				}
			}

			else if (input == 3) {
				System.out.println("3. 19단 중 7배수 단 < 선택");
				for (int i = 2; i < 20; i++) {
					if (i % 7 == 0) {
						System.out.printf("[%d]단\n", i);
						for (int j = 1; j < 10; j++) {
							System.out.printf("%d X %d = %d\n", i, j, i * j);
						}
						System.out.println("==========");
					}
				}
			} else if (input == 4) {
				System.out.println("프로그램 종료.");
				break;
			} else
				System.out.println("다시 입력");
			sc.close();
		} while (input != 4);
	}
}
