package chapter11.ex08;

public class Account {

	private long balance = 10000; // 은행 잔고

	Account() {
	} // 기본생성자

	public long getBalance() { // getter
		return balance; // 필드의 balance 값을 리턴.
	}

	// 입금 메소드
	public void deposit(int money) { // 입금 처리 후 balance에 잔고 적용.
		try {
			if(money > 0) {
				System.out.println("현재 잔액 : " + String.format("%,d", balance) + " 원");
				balance += money;
				System.out.println("입금 금액 : " + String.format("%,d", money)  + " 원");
				System.out.println("거래 후 잔액 : " + String.format("%,d", balance) + " 원");
			}else {
				throw new BalanceException("입금 장애 발생. 입금 금액을 확인하세요.");
			}
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}
	}

	// 출금 메소드
	public void withdraw(int money) { // 잔고와 비교 후 출금 여부 결정. balance에 잔고 적용.
		try {
			if (money <= balance) {
				System.out.println("현재 잔액 : " + String.format("%,d", balance) + " 원");
				balance -= money;
				System.out.println("출금 금액 : " + String.format("%,d", money)  + " 원");
				System.out.println("거래 후 잔액 : " + String.format("%,d", getBalance()) + " 원");
			} else {
				throw new BalanceException("출금 장애 발생. 잔액이 부족합니다.\n잔액 : " + balance + " 원");
			}
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}

	}
}
