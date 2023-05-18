package chapter08.ex03;

public class EX01 {
	public static void main(String[] args) {

		int[] coinUnit = {500,100,50,10};
		int money = 2680;
		System.out.println("받은 돈 : " + money);
		
		for ( int i = 0 ; i < coinUnit.length ; i++) {
			// 나누어 줄 거스름돈이 아래와 같이 출력 되도록 작성
			int change = money / coinUnit[i];
			System.out.println(coinUnit[i] + "원 : " + change);
			money = money%coinUnit[i];
		}
	}
}


/*
 * 실행결과
 * money = 2680
 * 500원 : 5
 * 100원 : 1
 * 50원 : 1
 * 10원 : 3
 */