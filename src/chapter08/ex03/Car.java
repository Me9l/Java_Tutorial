package chapter08.ex03;

public class Car {
	private String company ;
	private String carName ;
	private int carMaxSpeed ;
	private double carWeight ;
	
	// getter , setter 생성하여 각 필드에 값 입력 및 출력
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public int getCarMaxSpeed() {
		return carMaxSpeed;
	}
	public void setCarMaxSpeed(int carMaxSpeed) {
		this.carMaxSpeed = carMaxSpeed;
	}
	
	public double getCarWeight(){
		return carWeight;
	}
	public void setCarWeight(double carWeight) {
		this.carWeight = carWeight;
	}
	
	public static void main(String[] args) {
		// car 객체 생성
		Car c1 = new Car();
		// setter를 통해 field 값 입력
		c1.setCompany("Volvo");
		c1.setCarName("XC 90");
		c1.setCarMaxSpeed(280);
		c1.setCarWeight(1430.20);
		//getter를 통한 출력
		System.out.println(c1.getCompany());
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarMaxSpeed());
		System.out.println(c1.getCarWeight());
	}
}