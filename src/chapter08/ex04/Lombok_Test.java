package chapter08.ex04;

public class Lombok_Test {

	public static void main(String[] args) {
		Lombok l = new Lombok();
		l.setName("name");
		l.setEmail("mail.com");
		l.setAge(30);
		l.setGrade(2);
		
		System.out.println(l.getName());
		System.out.println(l.getEmail());
		System.out.println(l.getAge());
		System.out.println(l.getGrade());
		System.out.println(l.equals(l));
		
		System.out.println(l);
	}

}
