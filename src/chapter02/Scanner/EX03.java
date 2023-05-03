package chapter02.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> ages = new ArrayList<>();
		for (int i=0; i<3; i++) {
			System.out.print("이름입력 :");
			String name = sc.next();
			names.add(name);
			System.out.print("나이입력 :");
			int age = sc.nextInt();
			ages.add(age);
		}
		sc.close();
		
		for (int i=0 ; i < names.size() ; i++ ) {
			String temp1 = names.get(i);
			int temp2 = ages.get(i);
			System.out.printf("이름 : %s, 나이 : %d\n",temp1,temp2);
		}
		//나이 합
		int sum = 0 ;
		for (int i=0 ; i < ages.size() ; i++ ) {
			int age = ages.get(i);
			sum += age ;
		}
		System.out.println(sum);
		
	}

}
