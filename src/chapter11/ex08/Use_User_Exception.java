package chapter11.ex08;

class MinusException extends Exception {

	MinusException() {
//			super();
	}

	MinusException(String message) {
		super(message);
	}

}

class OverException extends Exception {

	OverException() {
		// super();
	}

	OverException(String message) {
		super(message);
	}
}

class Aa {
	void check(int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("예외 발생. (0보다 작은 입력)");
		} else if (score > 100) {
			throw new OverException("예외 발생. (100보다 큰 입력)");
		} else {
			System.out.println("입력 : " + score + ", 정상 처리");
		}
	}
}

public class Use_User_Exception {
	public static void main(String[] args) {
		Aa a1 = new Aa(); 
		try {
			a1.check(20);
			a1.check(120);
//			a1.check(-10);		//먼저 발생한 예외 때문에 처리하지 못함.
		} catch (MinusException | OverException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
}