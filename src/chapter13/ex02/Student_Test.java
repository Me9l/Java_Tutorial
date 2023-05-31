package chapter13.ex02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Student_Test {

	public static void main(String[] args) {
		// ArrayList 변수
		List<Student> arrList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int studentNum = 0;
		
		while (run) {
			System.out.println("==============================================");
			System.out.println("1. 학생수 | 2. 점수 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("==============================================");
			int select_num = sc.nextInt();
			
			if ( select_num == 1 ) {
				// 스케너로 학생수 인풋 받아 StudentNum에 할당.
				System.out.print("학생 수를 입력 하세요 >>> ");
				while(!sc.hasNextInt()) {
					System.out.print("정수를 입력 하세요 >>> ");
					sc.next();
				}
				studentNum = sc.nextInt();

			} else if ( select_num == 2 ) {
				// 학생 각각의 student 객체 생성 후 점수를 스케너로 입력받고 리스트에 저장
				if (studentNum <= 0) {
					System.out.println("학생 수를 입력하세요.");
				} else {
					System.out.println("학생 수 : " + studentNum + "명");
					for (int i = 0 ; i < studentNum ; i++) {
						System.out.println(i+1 + "번째 학생의 점수를 입력하세요. ("+(i+1)+"/"+studentNum+")");
						Student st = new Student();
						while(!sc.hasNextInt()) {
							System.out.print("정수를 입력 하세요 >>> ");
							sc.next();
						}
						st.setScore(sc.nextInt());
						arrList.add(st);
					}
					studentNum = 0 ;
				}
			} else if ( select_num == 3 ) {
				// 점수 리스트 출력
				if (arrList.isEmpty()) {
					System.out.println("점수를 먼저 입력해야 합니다.");
				}else {
					for (Student st : arrList) {
						System.out.println("점수 : " + st.getScore());
					}					
				}
			} else if ( select_num == 4 ) {
				// 최대점수, 평균 출력
				int sum = 0 ;
				int high = 0 ;
				for (Student st : arrList) {
					sum += st.getScore();
					if (high < st.getScore()) {
						high = st.getScore();
					}
				}
				if (arrList.size() > 0) {
					System.out.println("최고점수 : " + high+ "점.");
					System.out.println("점수 총 합 : " + sum + "점, 평균 : " + (double)sum/arrList.size() +"점.");					
				}
			} else if ( select_num == 5 ) {
				// 종료
				run=false;
				System.out.println("프로그램 종료.");
				sc.close();
//				break;
			}
			
		}
		
	}
}
