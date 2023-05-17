package chapter07.ex03;

class Product {
	// 생성자 오버로딩 필드의 갯수에 따라 생성자 생성
	// 객체 출력시 필드 내용 출력
	public Product() {}
	
	Product(String pName) {
		this.pName = pName;
	}
	
	Product(String pName, int pNo) {
		this.pName = pName;
		this.pNo = pNo;
	}
	
	Product(String pName, int pNo, int pPrice) {
		this.pName = pName;
		this.pNo = pNo;
		this.pPrice = pPrice;
	}

	Product(String pName, int pNo, int pPrice, int pCount) {
		this.pName = pName;
		this.pNo = pNo;
		this.pPrice = pPrice;
		this.pCount = pCount;
	}

	@Override
	public String toString() {
		String nts = String.format("%05d",pNo); // 제품번호로 들어온 숫자를 최소 5자리로 표현
		return "Product [제품명=" + pName + ", 제품번호=" + nts + ", 제품가격=" + pPrice + ", 주문수량=" + pCount + "]";
	}

	String pName;
	int pNo, pPrice, pCount;
}

public class EX01 {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product("iphone 15 pro");
		Product p3 = new Product("iphone",1230000);
		Product p4 = new Product("iphone 15 pro",1,1450000);
		Product p5 = new Product("iphone 15 pro",1,1450000,1);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}
}
