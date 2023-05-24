package chapter11.ex01;

abstract class TV {			// abstract class
	abstract void pow();
	abstract void ch();
	abstract void vl();
}

class Samsung extends TV {	// concrete class

	@Override
	void pow() {
		System.out.println("삼성 전원");
	}

	@Override
	void ch() {
		System.out.println("채널 변경");
	}

	@Override
	void vl() {
		System.out.println("볼륨 변경");
	}
}

//부모의 추상메소드를 일부만 구현한 경우
abstract class Sony extends TV {	// abstract class

	@Override
	void pow() {
		System.out.println("Sony pow");
	}

	@Override
	void ch() {
		System.out.println("Sony ch");
	}
}

class Sony_pot extends Sony {		// concrete class

	@Override
	void vl() {
		System.out.println("Sony vl");
	}
}

public class Abstract_method02 {
	public static void main(String[] args) {
//		TV a = new TV();			// 추상클래스는 객체화 불가능.
		TV samsung = new Samsung(); // 콘크리트 클래스를 객체화 해서 부모 추상클래스로 타입 지정은 가능.
		
//		TV b = new Sony();	 		// 일부 구현했어도 객체화 불가능.
		TV sony = new Sony_pot();
//		Sony son = new Sony_pot();
		
		samsung.pow();
		samsung.ch();
		samsung.vl();
		
		sony.pow();
		sony.ch();
		sony.vl();
	}
}