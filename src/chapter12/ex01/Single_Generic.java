package chapter12.ex01;

class Apple1 {String apple="사과";}
class Banana1 {String banana="바나나";}
class Pencil1 {String pencil="모나미";}

class Goods <T> {
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}
public class Single_Generic {

	public static void main(String[] args) {
		/*
		 * 제네릭 클래스 : 다양한 타입을 지정 할 수 있는 클래스
		 * 클래스 이름 뒤  <T> 에 들어이는 타입을 지정.
		 *  <T>에 들어오는 타입
		 *  - String	<==> String
		 *  - int		<==> Integer
		 *  - long		<==> Long
		 *  - short 	<==> Short
		 *  - float 	<==> Float
		 *  - double	<==> Double
		 *  - void		<==> Void
		 *  - boolean	<==> Boolean
		 *  - char  	<==> Character
		 */
		
		// apple 객체 생성
		Goods <Apple1> apple = new Goods<Apple1>();
		// setter 를 이용해 apple 객체 주입.
		apple.setT(new Apple1());
		// getter 를 이용해 Apple 객체 호출.		// 다운캐스팅 없이 호출 가능.
		System.out.println((apple.getT()).apple);
		
		
		// banana 객체 생성
		Goods <Banana1> banana = new Goods<Banana1>();
		// setter 를 이용해 banana 객체 주입.
		banana.setT(new Banana1());
		// getter 를 이용해 banana 객체의 필드 접근.
		System.out.println(banana.getT().banana);
		
		
		// pencil 객체 생성
		Goods<Pencil1> pencil = new Goods<>();
		pencil.setT(new Pencil1());
		System.out.println((pencil.getT()).pencil);
		
	}

}
