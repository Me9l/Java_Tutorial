package chapter12.ex02;

class Tiger {
	String name = "Tiger";
}

class Lion {
	String name = "Lion";
}

class Eagle {
	String name = "Eagle";

	public Eagle(String name) {
		this.name = name;
	}
}

class Animal {
	private Object obj = null;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}

public class EX01 {

	public static void main(String[] args) {

		/*
			Animal class 에 Tiger, Lion, Eagle 객체를 setter 주입. ( Object 로 up casting )
			getter 로 name field 에 접근. ( down casting )
		 */
		
		Animal animal = new Animal();
		animal.setObj(new Tiger());
		System.out.println(((Tiger)animal.getObj()).name);
		
		animal.setObj(new Lion());
		System.out.println(((Lion)animal.getObj()).name);
		
		animal.setObj(new Eagle("한화"));
		System.out.println(((Eagle)animal.getObj()).name);
	}
}