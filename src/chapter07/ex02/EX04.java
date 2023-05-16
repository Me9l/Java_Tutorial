package chapter07.ex02;

class F {
	// 1. method : 두 배열의 각 인덱스 값을 더해서 출력 (int)
	void Plus(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length|| i < arr2.length ; i++) {
			System.out.printf("%d + %d = %d\n", arr1[i],arr2[i],(arr1[i]+arr2[i]));
//			System.out.print(arr1[i] + arr2[i] + " ");
		}
	}
	// 2. method : 두 배열의 각 인덱스 값을 빼서 출력 (int)
	void Minus(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("%d - %d = %d\n", arr1[i],arr2[i],(arr1[i]-arr2[i]));
		}
	}
	
	// 3. method : 두 배열의 각 인덱스 값을 곱해서 출력 (int)
	void Mul(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("%d X %d = %d\n", arr1[i],arr2[i],(arr1[i]*arr2[i]));
		}
	}
	// 4. method : 두 배열의 각 인덱스 값을 나눠서 출력 (double)
	void Div(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("%d / %d = %.3f\n", arr1[i],arr2[i],((double)arr1[i]/(double)arr2[i]));
		}
	}
}

public class EX04 {
	public static void main(String[] args) {
		// 1. 정수 담는 배열 arr1, [100] : 7의 배수만 저장 (7, 14, 21 ...)
		int[] arr1 = new int[100];
		for (int i = 0, a = 7 ; i < arr1.length; i++) {
			arr1[i] = a;
			a += 7;
//			System.out.print(arr1[i] + " ");
		}
//		System.out.println();

		// 2. 정수 담는 배열 arr2, [100] : 4의 배수 && !8의배수 저장 (4, 12, 20 ...)
		int[] arr2 = new int[100];
		int s = 0; // 배열 크기
		for (int i = 1; true ; i++) {
			if (s == arr2.length) {
				break;
			}
			if ( i % 4 == 0 && i % 8 != 0) {
				arr2[s] = i;
//				System.out.println(arr2[s]);
				s++;
			}
		}
		
		for (int i = 0, j = 4 ; i < arr2.length; i++) {
			if (j % 4 == 0 && j %8 != 0) {
				arr2[i] = j ;
				j += 4;
			}
		}
		
		F f = new F() ;
		f.Plus(arr1, arr2);
//		f.Minus(arr1, arr2);
//		f.Mul(arr1, arr2);
		f.Div(arr1, arr2);
	}
}
