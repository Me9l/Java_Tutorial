package chapter11.ex08;

public class BalanceException extends Exception{
	BalanceException(){};
	BalanceException(String message){		// catch 에서 처리.
		super(message);
	};
}
