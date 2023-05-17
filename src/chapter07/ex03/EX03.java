package chapter07.ex03;

class Car {
	// 각 생성자에서 값을 할당 할 때 초기값을 로드, 각 필드의 기본값으로 할당.
	Car() {
		company = "회사명 미등록.";
		carName = "차종 미등록.";
		carColor = "알수 없음.";
		carDoor = 0;
		carWeight = 0.0;
	}
	
	Car(String company){
		this();
		this.company = company;
	}
	
	Car(String company,String carName) {
		this(company);
		this.carName = carName;
	}
	
	Car(String company,String carName,String carColor){
		this(company,carName);
		this.carColor = carColor;
	}
	
	Car(String company,String carName,String carColor,int carDoor){
		this(company,carName,carColor);
		this.carDoor = carDoor;
	}
	
	Car(String company,String carName,String carColor,int carDoor,double carWeight){
		this(company,carName,carColor,carDoor);
		this.carWeight = carWeight;
	}
	
	
	// field
	String company,carName,carColor;
	int carDoor;
	double carWeight;
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", carName=" + carName + ", carColor=" + carColor + ", carDoor=" + carDoor
				+ ", carWeight=" + carWeight + "]";
	}
		
}
public class EX03 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("huyndai");
		Car c3 = new Car("huyndai","genesis");
		Car c4 = new Car("huyndai","genesis","black");
		Car c5 = new Car("huyndai","genesis","black",2);
		Car c6 = new Car("huyndai","genesis","black",4,1200.5);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
