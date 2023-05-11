package chapter05.ex04;

public class Rectangle_Array_definition01 {
	public static void main(String[] args) {
		/*
		 * 다차원 배열 : 2차원
		 * 	- 정방형 배열 (2차원) : 행 (row | record) , 열 (column | field ) 이 동일한 배열
		 *  - 비정방형 배열 (2차원) : row, record, 열 이 동일하지 않은 배열
		 */
		
		// 1. 2차원 배열 선언
		int[][] arr1 = new int[3][4] ;		// 3 : 행 , 4 : 열
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[0][3] = 4;
		
		arr1[1][0] = 10;
		arr1[1][1] = 20;
		arr1[1][2] = 30;
		arr1[1][3] = 40;
		
		arr1[2][0] = 100;
		arr1[2][1] = 200;
		arr1[2][2] = 300;
		arr1[2][3] = 400;
		
		System.out.println(arr1[1][2]);
		
		System.out.println("arr1 의 행 수 : " + arr1.length);		// 3 : 행의 갯수 (2차원 배열일 때)
		System.out.println("arr1[0]의 열 수 : " + arr1[0].length);		// 4 : 0번 행의 열의 갯수
		System.out.println("arr1[1]의 열 수 : " + arr1[1].length);		// 4 : 1번 행의 열의 갯수
		System.out.println("arr1[2]의 열 수 : " + arr1[2].length);		// 4 : 2번 행의 열의 갯수
		System.out.println("------------------");
		//for 문을 사용해 arr1 배열의 값 출력.
		for (int i = 0; i < arr1.length; i++) {				//	행 루프
			for (int j = 0; j < arr1[i].length; j++) {		//	열 루프
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
