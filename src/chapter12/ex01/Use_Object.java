package chapter12.ex01;

class Banana {
	String name;

	Banana() {
	}

	Banana(String name) {
		this.name = name;
	}
}

class Orange {
	String name;

	Orange() {
	}

	Orange(String name) {
		this.name = name;
	}
}

class Pencil {
	String name;

	Pencil() {
	}

	Pencil(String name) {
		this.name = name;
	}
}

class Goods2 {
	// field
	private Object obj = new Object();

	// getter
	public Object getObj() {
		return obj;
	}

	// setter
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class Use_Object {
	public static void main(String[] args) {
		/*
		 * Object 모든 클래스의 부모 ( 기본형 )
		 *  다운캐스팅을 통해 필드/메소드에 접근 가능.
		 *  	- 문제 발생 가능.
		 */
		
		Goods2 g2 = new Goods2();			// 객체 생성.
		
		g2.setObj(new Banana("바나나"));	// object type으로 Banana객체 주입.
		Object o1 = g2.getObj();			// object 로 자동 업캐스팅.
		Banana b1 = (Banana)o1;				// 다운 캐스팅
		System.out.println(b1.name);

		g2.setObj(new Orange("오렌지"));
		
		System.out.println(((Orange)g2.getObj()).name);
		
		g2.setObj(new Pencil("모나미"));
		System.out.println(((Pencil)g2.getObj()).name);
	}
}
