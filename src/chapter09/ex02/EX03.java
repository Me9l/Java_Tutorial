package chapter09.ex02;

class Customer{
	void memberInfo() {
		System.out.println("일반 회원.");
	}
}

class Gold extends Customer{
	@Override
	void memberInfo() {
		System.out.println( getClass().getSimpleName() + "회원");
	}
}

class Silver extends Customer{
	@Override
	void memberInfo() {
		System.out.println( getClass().getSimpleName() + "회원");
	}
	
}

class Bronze extends Customer{
	@Override
	void memberInfo() {
		System.out.println( getClass().getSimpleName() + "회원");
	}
	
}


public class EX03 {

	public static void main(String[] args) {

//		자식을 객체화 해서 부모 타입으로 지정.
//		부모 메소드 호출시 override한 메소드 출력.
//		for, foreach 를 사용해 출력.
		
		Customer gold = new Gold();
		Customer silver = new Silver();
		Customer bronze = new Bronze();
		gold.memberInfo();
		silver.memberInfo();
		bronze.memberInfo();
		
		System.out.println("====== for ======");
		Customer[] arr = new Customer[] {gold,silver,bronze};
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			arr[i].memberInfo();
		}
		System.out.println("====== for each ======");
		
		for (Customer c : arr ) {
			c.memberInfo();
		}
	}

}