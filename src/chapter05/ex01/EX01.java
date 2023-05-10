package chapter05.ex01;

public class EX01 {
	public static void main(String[] args) {
		/*
		 * 배열[100] 생성 후 3의 배수만 저장. 출력
		 */

		int len = 100;
		int[] arr = new int[len];
		int a = 0;

		for (int i = 0; i < arr.length; i++) {
			a+=3;
			arr[i] = a;
//			arr[i] = a += 3;
//			System.out.println(arr[i]);
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
		
//		------- Enhanced For : 향상 for -------
//		배열의 처음, 끝 까지 해당하는 모든 값 을 출력
		
		for (int k : arr) {
			System.out.print(k + " ");
		}
		
	}
}