package chapter11.ex08;

public class Account_Test {

	public static void main(String[] args) {
		Account a = new Account();
		a.getBalance();		// getter를 이용해 private 필드 정보 출력.
		a.deposit(1000);	// 입금
		a.withdraw(11000);	// 출금
		a.withdraw(1);		// 잔액보다 많은 출금.
		a.deposit(-1);		// 음수값 입금.
	}

}
