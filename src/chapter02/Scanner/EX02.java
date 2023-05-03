package chapter02.Scanner;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		// 이름, 몸무게(double) 입력받아 합,평균 출력
		Scanner sc = new Scanner(System.in) ;
		String name1, name2, name3 ;
		double w1, w2, w3 ;
		System.out.print("이름 1 : ");
		name1 = sc.next();
		System.out.print("몸무게 : ");
		w1 = sc.nextDouble();
		System.out.print("이름 2 : ");
		name2 = sc.next();
		System.out.print("몸무게 : ");
		w2 = sc.nextDouble();
		System.out.print("이름 3 : ");
		name3 = sc.next();
		System.out.print("몸무게 : ");
		w3 = sc.nextDouble();
		sc.close();
		double sum = w1+w2+w3 ;
		double avg = sum / 3 ;
		System.out.println("===========================");
		System.out.printf("이름 1 : %s, 몸무게 : %3.2f\n이름 3 : %s, 몸무게 : %3.2f\n이름 3 : %s, 몸무게 : %3.2f\n",name1,w1,name2,w2,name3,w3);
		System.out.println("===========================");
		System.out.printf("합 : %.2f, 평균 : %3.2f\n",sum,avg);
		System.out.println("===========================");
		
	}
}
