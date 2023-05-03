package chapter02.Scanner;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 1. Scanner 등록
		// 2. 이름1, 이름2 , 이름3 , 이름4 : 스캐너로 입력 sc.next();
		// 3. 각 나이 입력 : 스캐너로 입력 sc.nextInt();
		// 4. 값 출력
		// 5. 전체 나이의 합, 평균 소수점 2자리까지 출력
		
		String name1, name2, name3, name4 ;
		int age1, age2, age3, age4 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 1 입력 : ");
		name1 = sc.next();
		System.out.print("나이 입력 : ");
		age1 = sc.nextInt();
		System.out.print("이름 2 입력 : ");
		name2 = sc.next();
		System.out.print("나이 입력 : ");
		age2 = sc.nextInt();
		System.out.print("이름 3 입력 : ");
		name3 = sc.next();
		System.out.print("나이 입력 : ");
		age3 = sc.nextInt();		
		System.out.print("이름 4 입력 : ");
		name4 = sc.next();
		System.out.print("나이 입력 : ");
		age4 = sc.nextInt();
		sc.close();
		double sum = age1+age2+age3+age4 ;
		double avg = sum / 4;

		System.out.println("=================");
		System.out.printf("이름1 : %s 나이 : %d\n이름2 : %s 나이 : %d\n이름3 : %s 나이 : %d\n이름4 : %s 나이 : %d\n",name1,age1,name2,age2,name3,age3,name4,age4);
		System.out.println("=================");
		System.out.printf("나이 총 합 : %4.2f\n나이 평균 : %4.2f\n",sum,avg);
		System.out.println("=================");
		

	
	}

}
