package chapter09.ex06;


class Apple {
	String name;
	int price;
	int count;
	
	Apple(String name, int price, int count){
		this.name = name ;
		this.price = price ;
		this.count = count ;
	}
	
}
class Banana {
	String name;
	int price;
	int count;
	Banana(String name, int price, int count){
		this.name = name ;
		this.price = price ;
		this.count = count ;
	}
}
class Strawberry {
	String name;
	int price;
	int count;	
	Strawberry(String name, int price, int count){
		this.name = name ;
		this.price = price ;
		this.count = count ;
	}
}

public class EX01 {
	
	void totalPrice(Object[] obj) {
		String name;
		int price = 0 ;
		int count ;

		name = ((Apple)obj[0]).name;
		price = ((Apple)obj[0]).price;
		count = ((Apple)obj[0]).count;
		System.out.println(name +"의 총 가격 : " + (price * count));
		
		name = ((Banana)obj[1]).name;
		price = ((Banana)obj[1]).price;
		count = ((Banana)obj[1]).count;
		System.out.println(name +"의 총 가격 : " + (price * count));
		
		name = ((Strawberry)obj[2]).name;
		price = ((Strawberry)obj[2]).price;
		count = ((Strawberry)obj[2]).count;
		System.out.println(name +"의 총 가격 : " + (price * count));
	}
	
	public static void main(String[] args) {
		/*
		 * 모든 클래스는 Object의 자식 클래스.
		 * 모든 클래스는 Object 타입으로 Upcasting 가능.
		 */
		
		/* 생성자로 각 필드에 값 할당.
		 * "사과" 2000 5, "바나나" 4000 10, "딸기" 5000 30
		 * 
		 * 모든 객체를 object로 받아 배열에 넣는다.
		 */
		
		Object a = new Apple("사과",2000,5);
		Object b = new Banana("바나나",4000,10);
		Object c = new Strawberry("딸기",5000,30);
		
		Object[] obj = new Object[] {a,b,c};
		// 배열을 method에 전달.
		EX01 e = new EX01();
		e.totalPrice(obj);
	}
}
