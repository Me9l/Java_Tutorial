package chapter06.ex01;
class Animal {	
	String name,cry;
	int age;
	double weight;
	
	public void print() {
		System.out.println(" 동물 이름 : " + name );
		System.out.println(" 울음 소리 : " + cry );
		System.out.println(" 기대 수명 : " + age );
		System.out.println(" 평균 체중 : " + weight );
	}
}

public class Object05 {
	public static void main(String[] args) {
		//Animal class => tiger :"호랑이"/"어흥"/30/300
		//Animal class => eagle :"독수리"/"까악"/10/40
		//Animal class => dog :"강아지"/"멍멍"/15/20
		
		Animal tiger = new Animal();
		tiger.name = "호랑이";
		tiger.cry = "어흥";
		tiger.age = 30;
		tiger.weight = 300;
		tiger.print();
		
		Animal eagle = new Animal();
		eagle.name = "독수리";
		eagle.cry = "까악";
		eagle.age = 10;
		eagle.weight = 40;
		eagle.print();
		
		Animal dog = new Animal();
		dog.name = "강아지";
		dog.cry = "멍멍";
		dog.age = 15;
		dog.weight = 20;
		dog.print();
				
		
		Animal[] animal = new Animal[3];
		animal[0] = tiger;
		animal[1] = eagle;
		animal[2] = dog;
		animal[0].print();
		animal[1].print();
		animal[2].print();
		
		
	}
}
