package hi.org;

public class ConsoleOutput3 {
	public static void main(String[] args) {
		//변수 선언 : Java != JavaScript
		// <자료형> <변수명> = <변수에 들어갈 초기값> ;
		//자료형에 맞는 변수 값을 넣어야함.
		String f = "Hong gil dong" ;
		String m = "Hong gil soon" ;
		String i = "Hong jin hooo" ;
		
		int age = 30 ;
		double weight = 70.5 ;
		System.out.println(age);
//		int age = 50 ; // 오류 : 중복된 변수명
		age = 50 ; // 값 재정의
		System.out.println(age);
		double a = 80 ; //정의 가능
//		int b = 90.1 ; // 정의 불가능
		
		System.out.println("아버지 이름은 "+f+" 이고, 어머니 이름은 "+m+" 이다.");
		System.out.println("나의 이름은 "+i+" 이고, 나이는 "+age+" 이다.");
		System.out.print("아버지 이름은 "+f+" 이고, 어머니 이름은 "+m+" 이다.");
		System.out.print("나의 이름은 "+i+" 이고, 나이는 "+age+" 이다.\n");
		System.out.printf("아버지 이름 : %s, 어머니 이름 %s\n",f,m);
		System.out.printf("내 이름 : %s, 몸무게 : %s\n",i,a);
		
		
	}

}
