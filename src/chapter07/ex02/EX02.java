package chapter07.ex02;

class CALC {
	int plus ( int a , int b ) {
		return a + b ;
	}
	int minus ( int a , int b ) {
		return a - b ;
	}
	int mul ( int a , int b ) {
		return a * b ;
	}
	double div ( int a ,int b ) {
		return (double)a / b ; // upCast to double ( int : 나머지가 버려진다. )
	}
}

public class EX02 {
	public static void main(String[] args) {
		CALC cal = new CALC();
		int result ;
		result = cal.plus(10, 20);
		System.out.println(result);
		
		System.out.println(cal.minus(10, 20));
		System.out.println(cal.mul(7, 3));
		System.out.println(cal.div(5, 20));
	}
}
