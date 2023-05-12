package chapter05.ex06;

public class EX02 {
	public static void main(String[] args) {
		/*
		 * main method 의 배열변수 args로 실수값 받아서 계산.
		 * args : 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
		 * for loop 를 이용해 처리
		 * 합계 : 실수값의 합
		 */
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
		double sum = 0 ;
		for (int i = 1; i < args.length; i++) {
			sum += Double.parseDouble(args[i]);		//args[i] = String => double 형변환
		}
		System.out.printf("실수의 합 : %.2f\n", sum);
	}
}
