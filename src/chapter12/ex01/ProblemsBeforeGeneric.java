package chapter12.ex01;

// 상품을 저장하는 클래스.
// Generic을 사용하지 않는 경우 하나의 상품 클래스에 하나의 타입이 저장.

class Apple{
	String name;
	Apple(){}
	Apple(String name) {
		this.name = name;
	}
}
class Mango {
	String name;

	Mango() {
	}

	Mango(String name) {
		this.name = name;
	}
}
class Goods1{
	private Apple apple = new Apple();
	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple = apple;
	}
	private Mango mango = new Mango();
	public Mango getMango() {
		return mango;
	}
	public void setMango(Mango mango) {
		this.mango = mango;
	}
	
	
}


public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		/* 
		 * Generic 사용 전 발생 할 수 있는 문제.
		 * 	Generic - 클래스 내부에 다양한 타입을 정의해서 넣을 수 있다.
		 * 		Generic 사용 전에는 하나의 클래스에 다양한 타입의 정보를 저장하려면
		 * 		각 클래스를 만들어 사용. 하나의 클래스에서 다양한 객체정보를 저장하기 위해
		 * 		Object 타입으로 업캐스팅 해서 저장 후, 다운캐스팅 하여 객체 정보를
		 * 		받아야 한다.
		 * 
		 * 		Generic 을 사용하면 업/다운 캐스팅 없이 여러 타입의 객체를 하나의 클래스에서 사용 가능.
		 */
		
		Goods1 g1 = new Goods1();
		
		g1.setApple(new Apple("사과"));
		System.out.println(g1.getApple().name);
		
		g1.setApple(new Apple("과사"));
		System.out.println((g1.getApple()).name);
		
		g1.setApple(new Apple("부사"));
		System.out.println(g1.getApple().name);
		
		g1.setMango(new Mango("망고"));
		System.out.println(g1.getMango().name);
		
	}
}