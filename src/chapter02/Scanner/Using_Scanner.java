package chapter02.Scanner;

import java.util.Scanner;

public class Using_Scanner {
	public static void main(String[] args) {
		// Scanner 사용하기.
		// console 에서 값을 입력.
		// 라이브러리. import 를 사용해 외부 라이브러리를 사용.
		// ctrl + shift + o : import 단축키.
		
		Scanner sc = new Scanner(System.in) ;
		String name ;
		int kor ;
		int eng ;
		int math ;
		int music ;
		int science ;
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		System.out.print("음악 점수 : ");
		music = sc.nextInt();
		System.out.print("과학 점수 : ");
		science = sc.nextInt();
		System.out.println("===========");
		System.out.printf("이름 : %s\n국어 점수 : %d\n영어 점수 : %d\n수학 점수 : %d\n음악 점수 : %d\n과학 점수 : %d\n", name, kor, eng, math, music, science);
		System.out.println("===========");
		
		int sum = kor + eng + math + music + science ;
		double avg = sum / 5.0 ;
		System.out.printf("총합 : %d\n평균 : %4.2f",sum,avg);
	}
}
