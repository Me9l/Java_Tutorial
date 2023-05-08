package chapter04.ex02;

public class Switch_statement {
	public static void main(String[] args) {
		/*
		--------- 제어문 Switch ---------
			- if 문은 조건이 true 일 경우 해당 스코프{} 안의 코드를 실행 후 break;
			- swich 문은 break; 를 만나야 스코프{} 를 빠져나온다.
		
			default : 모든 case에 해당사항이 없을 경우 실행. if문의 else 와 같다.
		*/
		
		//1. break; 를 사용하지 않을 경우
		
		int v1 = 3 ;
		
		switch (v1) {

		case 1 :
			System.out.println("A");
		case 2 :
			System.out.println("B");
		case 3 :
			System.out.println("C");
		case 4 :
			System.out.println("D");
		default :
			System.out.println("F");
		}
		// break; 를 사용하지 않으면 해당 case 이후의 case 들이 모두 실행 된다.

		System.out.println("=======");

		switch (v1) {
//		default :						//정상작동하지만 좋지않음.
//			System.out.println("F");	//일반적으로 마지막라인에 작성.	
//			break;
		case 1 :
			System.out.println("A");
			break;
		case 2 :
			System.out.println("B");
			break;
		case 3 :
			System.out.println("C");
			break;
		case 4 :
			System.out.println("D");
			break;
		default :
			System.out.println("F");		
//			break;						//생략가능
		}
		
		
//		String v2 = "a";
//		switch (v2) {
//		case "a" :
//		System.out.println("break"); break;
//		}
		
//		switch 문은 if else if 문으로 변환 가능
		
		if (v1 == 1) {
			System.out.println("A");
		}else if (v1 == 2) {
			System.out.println("B");
		}else if (v1 == 3) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
	}
}
