package chapter11.ex05;

interface TV01 {
	void pow();
}
interface TV02 {
	void ch();
}
interface TV03 {
	void vol();
}

interface TT extends TV01,TV02,TV03{
	//구현되지 않은 pow(), ch(), vol() 를 상속받은 상태.
	void netflex();
}

class Samsung implements TT {

	@Override
	public void pow() {
		System.out.println("전원 꺼짐/켜짐.");
	}
	public void pow(boolean a) {
		if ( true == a ) {
			System.out.println("");
		}
	}
	@Override
	public void ch() {
		System.out.println("채널 변경.");
	}
	@Override
	public void vol() {	
		System.out.println("볼륨 변경.");
	}
	@Override
	public void netflex() {
		System.out.println("넷플릭스 실행.");
	}
	
}

public class Inheritance02 {
	public static void main(String[] args) {
		/*
		 * 클래스가 클래스를 상속 : extends
		 * 인터페이스가 인터페이스를 상속 : extends
		 */
		
		TT tv = new Samsung();
		tv.pow();
		tv.ch();
		tv.vol();
		tv.netflex();
		
	}
}
