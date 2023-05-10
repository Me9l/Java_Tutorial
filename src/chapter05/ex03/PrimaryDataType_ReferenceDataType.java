package chapter05.ex03;

public class PrimaryDataType_ReferenceDataType {
	public static void main(String[] args) {
		
		// 기본 데이터 타입에서의 대입연산 ( Stack 값 복사 )
		int v1 = 3;
		int v2 = v1;
		v2 = 7;
		
		System.out.println(v1);
		System.out.println(v2);

		// 참조 데이터 타입에서의 대입 연산 ( Stack의 Heap 주소 복사 )
		
		int[] arr1 = new int[] {1,2,3}; // Stack에 new int[]{1,2,3} 의 heap 영역 주소값을 갖는 arr1 을 생성.
		int[] arr2 = arr1;				// arr1 의 주소값 가리키는 arr2 생성.
		arr2[0] = 7;					// arr2[0] 의 값을 할당 > arr2는 arr1을 가리키고 있고 arr1은 heap영역의 int[3]영역을 가리키므로 arr1[0] 에 값을 할당.
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		System.out.println(arr1);
		System.out.println(arr2);
	}
}
