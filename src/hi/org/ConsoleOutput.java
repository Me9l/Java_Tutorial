package hi.org;

public class ConsoleOutput {

	public static void main(String[] args) {
		String hi[] = {"hi","hello"};
		System.out.println(hi[0]+" , "+hi[1]);
		System.out.println(2 + 4);
		System.out.println("2" + "4");
		System.out.println(11.5 + 11.5);
		System.out.println("11.5" + 11.5); //실수를 문자열로 처리
		
		//변수 : 문자열
		String str = "String type var" ;
		System.out.println(str);
		//변수 : 정수
		int num1 = 100 ;
		System.out.println(num1);
		//자료형에 따라 출력 (printf)
		System.out.printf("%x\n",10);  //%d :16진수 출력
		System.out.printf("%d\n",10);  //%d :10진수 출력
		System.out.printf("%o\n",10);  //%o : 8진수 출력

		System.out.printf("%s\n","문자열 출력"); //%s : 문자열
		System.out.printf("%f\n",3.14); //%f : 실수 (6자리까지)
		System.out.printf("%4.2f\n",3.14); //%4.2f : 실수 (전체4자리,소수점이하2자리)
		System.out.printf("%d 와 %4.2f 를 출력\n",num1,3.14);
	}

}
