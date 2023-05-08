package chapter04.ex01;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
//	학점의 합/평, 홀/짝, 이름식별
		
		int select ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============================================");
		System.out.println(" 1. 학점 합계/평균  | 2. 홀수/짝수 | 3. 같은 이름 식별");
		System.out.println("============================================");
		System.out.print("원하는 프로그램 선택 : ");
		select = sc.nextInt();
		
		if ( select == 1 ) {
			int kor, eng, math ;
			System.out.println("1번 선택.");
			System.out.print("- 국어 점수 : ");
			kor = sc.nextInt();
			System.out.print("- 영어 점수 : ");
			eng= sc.nextInt();
			System.out.print("- 수학 점수 : ");
			math = sc.nextInt();
			
			int sum = kor+eng+math ;
			double avg = sum/3.0;
			
			System.out.printf("합계 : %d, 평균 : %.2f",sum,avg);
		}else if ( select == 2 ) {
			int oddEven ;
			System.out.print("2번 선택.\n판별할 숫자를 입력하세요 : ");
			oddEven = sc.nextInt();
			System.out.printf( (oddEven%2==0) ? "입력한 숫자 [%d]: 짝수" : "입력한 숫자 [%d] : 홀수", oddEven, oddEven );
			
		}else if ( select == 3 ) {
			System.out.println("3번 선택.");
			String name1, name2 ;
			System.out.println("이름 입력 (공백이나 Enter로 구분) : ");
			name1 = sc.next();
			name2 = sc.next();
			if (name1.equals(name2)) {
				System.out.println("동일한 이름.");
			}else System.out.println("동일하지 않은 이름.");
		}
		sc.close();
	}
}
