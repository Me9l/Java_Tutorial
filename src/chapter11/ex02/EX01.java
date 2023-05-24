package chapter11.ex02;

abstract class Calc {
	abstract int add(int a, int b); // 두 정수를 받아 더한 값 리턴.

	abstract int dif(int a, int b); // 두 정수를 받아 뺀 값 리턴.

	abstract int mul(int a, int b); // 두 정수를 받아 곱 한 값 리턴.

	abstract double div(int a, int b); // 두 정수를 받아 나눈 값 리턴.
}

class CalcFunc extends Calc {

	@Override
	int add(int a, int b) {
		int add = a + b;
		return add;
	}

	@Override
	int dif(int a, int b) {
		int dif = a - b;
		return dif;
	}

	@Override
	int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}

	@Override
	double div(int a, int b) {
		double div = (double) a / (double) b;
		return div;
	}

}

public class EX01 {
	public static void main(String[] args) {
		// 1. 콘크리트 클래스 생성해서 사용.

		Calc cal1 = new CalcFunc();
		System.out.println(cal1.add(4, 7));
		System.out.println(cal1.dif(4, 7));
		System.out.println(cal1.mul(4, 7));
		System.out.println(cal1.div(4, 7));

		// 2. 익명 클래스로 사용.

		Calc cal2 = new Calc() {

			@Override
			int add(int a, int b) {
				return a + b;
			}

			@Override
			int dif(int a, int b) {
				return a - b;
			}

			@Override
			int mul(int a, int b) {
				return a * b;
			}

			@Override
			double div(int a, int b) {
				return (double) a / (double) b;
			}
		};
		System.out.println(cal2.add(3, 8));
		System.out.println(cal2.dif(3, 8));
		System.out.println(cal2.mul(3, 8));
		System.out.println(cal2.div(3, 8));
	}
}
