package chapter05.ex03;

public class EX02 {
	public static void main(String[] args) {
		/*
		 * - 정수 배열[1000] 생성. - 4의 배수, !8의 배수 저장 10개씩 끊어서 출력. - for문 이용.
		 */

		int[] arr = new int[1000]; // 배열[1000] index : 0 ~ 999
		int sizeOfArr = 0; // 배열크기
		int i; // 4의배수 & !8의배수 값

		for (i = 1; true; i++) {
			if (sizeOfArr == arr.length)
				break;
			if (i % 4 == 0 && i % 8 != 0) {
				arr[sizeOfArr] = i;
				sizeOfArr++;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
			
			if ((j+1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("===============================================");

		
		///////////////////////////////////////////////////
		
		
		int[] arr1 = new int[1000];
		for (int j = 0, a = 1; true; a++) { // j : index, a : value
			if (j == 1000)
				break;
			if ((a % 4 == 0) && (a % 8 != 0)) {
				arr1[j] = a;
				j++;
			}
		}
		
		// 출력
		for (int j = 0; j < arr1.length; j++) {
			System.out.print(arr1[j] + " ");
			
			if ( (j+1) % 10 == 0 ) {
				System.out.println();
			}
		}
	}
}
