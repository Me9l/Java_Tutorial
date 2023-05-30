package chapter12.ex06;

// Generic Class
// Point class : x,y를 표시
// X : X 좌표, Y : Y 좌표
class Point<X,Y> {
	X x ;
	Y y ;
	
	// 생성자를 사용해서 필드 값 입력
	Point( X x , Y y ) {
		this.x = x;
		this.y = y;
	}
	
	//getter 로 필드 값 출력
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
}

// Generic Method Class
class GenericM {
	// 두 점의 좌표를 매개변수로 받아 넓이를 구해서 리턴 (p1 : 10.5, 13.3) (p2 : 30.5,27,3)
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		// 두 점의 좌표값을 받아서 넓이를 구하여 리턴.
//		double width = (double)p2.getX() - (double)p1.getX();
//		double height = (double)p2.getY() - (double)p1.getY();
		return ((double)p2.x - (double)p1.x) * ((double)p2.y - (double)p1.y);
	}
}


public class EX01 {
	public static void main(String[] args) {
		Point<Double,Double> p1 = new Point<>(10.5,13.3);
		Point<Double,Double> p2 = new Point<>(30.5,27.3);
//		System.out.println("p1 X : " + p1.getX());
//		System.out.println("p1 Y : " + p1.getY());
//		System.out.println("p2 X : " + p2.getX());
//		System.out.println("p2 Y : " + p2.getY());
		System.out.println(GenericM.makeRectangle(p1, p2));
//		double rectangle = GenericM.<Double,Double>makeRectangle(p1, p2); // Double생략가능.
//		System.out.println(rectangle);
	}
}
