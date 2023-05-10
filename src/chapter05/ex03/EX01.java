package chapter05.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
//		배열에 저장 후 출력
		Scanner sc = new Scanner(System.in);
		int select;
		int sizeOfArr;
		int[] arr;
		do {
			System.out.println("======================================================================");
			System.out.println("1. input 값을 받아서 배열의 크기를 지정. 7의 배수와 8의 배수 저장, 출력.");
			System.out.println("2. input 값을 받아서 배열의 크기를 지정. 1씩 증가 하는 값을 넣고, 4의 배수만 빼고 저장, 출력.");
			System.out.println("3. input 값을 받아서 배열의 크기를 지정. 3의 배수이면서 6의 배수가 아닌 수 저장, 출력.");
			System.out.println("4. 프로그램 종료.");
			System.out.println("======================================================================");
			System.out.print("선택 ( 1 ~ 4 숫자로 입력. ) >>>>> ");
			select = sc.nextInt();

			if (select == 1) {
				// input 값을 받아서 배열의 크기를 지정. 7의 배수와 8의 배수 저장, 출력.
				System.out.println("배열의 크기 지정 >>>>> ");
				sizeOfArr = sc.nextInt();
				arr = new int[sizeOfArr];
//				int seven = 7;
//				int eight = 8;
//				for (int i = 0; i < arr.length; i++) {
//					arr[i] = seven;
//					seven += 7;
//					System.out.print("7의 배수 : " + arr[i]);
//					i++;
//					arr[i] = eight;
//					eight += 8;
//					System.out.println(", 8의 배수 : " + arr[i]);
//				}
				int a = 0; // 배열 인덱스 번호
				for (int i = 1;; i++) { // i = 배열 인덱스에 저장되는 7의 배수와 8의 배수.
					if (i % 7 == 0 || i % 8 == 0) {
						arr[a] = i;
						a++;
					}
					if (a == sizeOfArr)
						break;
				}
				//for
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println("\n");
				
				//Enhanced For
				for (int k : arr) {
					System.out.print(k + " ");
				}
				System.out.println("\n");
				
				//Arrays.tostring()
				System.out.println(Arrays.toString(arr));
				
			} else if (select == 2) {
				// input 값을 받아서 배열의 크기를 지정. 1씩 증가 하는 값을 넣고, 4의 배수만 빼고 저장, 출력.
				System.out.print("배열의 크기 지정 >>>>> ");
				sizeOfArr = sc.nextInt();
				arr = new int[sizeOfArr];
//				int num = 0;
//				for (int i = 0; i < arr.length; i++) {
////					if (num == 0) {
////						arr[i] = num;
////					} else if (num % 4 == 0) {
////						num++;
////					}
////					arr[i] = num;
////					num++;
//					arr[i] = (num == 0) ? num : (num % 4 == 0) ? num : num++;
//					num++;
//					System.out.println(arr[i]);
//				}
				int i = 0 ;	// 배열 인덱스 번호
				int a ;		// 인덱스에 들어갈 값
				
				// 배열에 값 저장.
				for (a = 1; ; a++) {
					if (a % 4 == 0) continue;
					arr[i] = a;
					i++;
					
					if (i ==sizeOfArr) break;
				}
				//for
				for (i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");					
				}
				System.out.println("\n");
				//forEach
				for ( int j : arr) {
					System.out.print(j + " ");
				}
				System.out.println("\n");
				
				//Arrays.toString()
				System.out.println(Arrays.toString(arr));
				
			} else if (select == 3) {
				// input 값을 받아서 배열의 크기를 지정. 3의 배수이면서 6의 배수가 아닌 수 저장, 출력.
				System.out.print("배열의 크기 지정 >>>>> ");
				sizeOfArr = sc.nextInt();
				arr = new int[sizeOfArr];
//				int num = 0;
//				for (int i = 0; i < arr.length; i++) {
//					arr[i] = num;
//					num += 3;
//					if (num % 6 != 0) {
//						i--;
//					}
//				}
				
				int a ; // 들어갈 값
				int b ; // 인덱스번호
				////////////////////////////
				//여기부터 시작
				
				for (int j = 0; j < arr.length; j++) {
					System.out.println(arr[j]);
				}
			
			} else if (select == 4) {
				System.out.println("프로그램 종료.");
				sc.close();
				break;
			} else
				System.out.println("잘못 입력.");
		} while (select != 4);
		sc.close();

	}
}
