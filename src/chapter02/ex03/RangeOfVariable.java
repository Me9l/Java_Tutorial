package chapter02.ex03;

public class RangeOfVariable {
	public static void main(String[] args) {
		//전역변수
		int value1 = 1 ;
		
		{
			//지역변수
			int value2 = 2;
			System.out.println(value1);
			System.out.println(value2);
		}
		
		System.out.println(value1);
//		System.out.println(value2); 접근 불가
		
	}
}
