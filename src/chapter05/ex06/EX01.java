package chapter05.ex06;

public class EX01 {
	public static void main(String[] args) {
		/*
		 * main 메소드 args 로 다음 값 전달. 국어 60 영어 70 수학 80 음악 90 과학 70 각 과목의 합계 , 평균
		 */

//		String[] a = args;
//		int sum = 0;
//		int avg ;
//		for (int i = 0; i < a.length; i++) {
////			System.out.println(a[i].toString());
//			if (i % 2 != 0) {
//				sum += Integer.parseInt(a[i]);
//			}
//		}
//		System.out.println("각 과목 합계 : "+sum);
//		System.out.println("각 과목 평균 : "+(sum/(a.length/2)));
//		

		// 1 . for loop 로 Args 전체 내용 출력
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		int sum = 0, count = 0;
		// 과목 점수만 int 형변환
		for (int i = 0; i < args.length; i++) {
			if (i % 2 != 0) {
				sum += Integer.parseInt(args[i]);
				count++;
			}
		}
		System.out.printf("\n합계 : %d , 평균 : %.2f\n", sum, ((double) sum / count));

	}
}
