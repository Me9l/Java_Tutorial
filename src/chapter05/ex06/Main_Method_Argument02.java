package chapter05.ex06;

public class Main_Method_Argument02 {
	public static void main(String[] args) {
		//main method 의 input 으로 실수 를 받아 계산.
		
		// 1. 직접 매개변수를 받아서 할당.
		String a = args[0];
		String b = args[1];
		String c = args[2];
		
		System.out.println(a + b + c);
		
		// String 에 저장 된 실수를 double 로 변환
		double aa =  Double.parseDouble(a);
		double bb =  Double.parseDouble(b);
		double cc =  Double.parseDouble(c);
		
		System.out.println(aa + bb + cc);
		
//		int aaa = (int)aa;
		
		// for loop 를 이용한 출력
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
