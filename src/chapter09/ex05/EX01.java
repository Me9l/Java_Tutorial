package chapter09.ex05;

class Student{
	String name;
	// 합계와 평균 출력 ( 오버라이딩을 통해 정의 )
	void sum_avg() {
	}
}

class Student_Sub extends Student {
	int kor, eng, math ;
	// 생성자로 매개변수 값을 받아서 각 필드의 값 할당. name, kor, eng, math; 

	Student_Sub(String name, int kor, int eng, int math) {
		super.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum_avg();
	}
	
	@Override
	void sum_avg() {
		int[] total = new int[] {kor,eng,math};
		int sum = 0 ;
		for (int i : total) {
			sum += i;
		}
		double avg = ((double)sum)/total.length;
		System.out.println(name + " 님의 성적 합 : " + sum + "평균 : " + avg);
		System.out.println("========================================");
	}
	
}

public class EX01 {
	public static void main(String[] args) {
		/* 각 객체의 필드 값은 생성자 호출시 매개변수로 값 할당.
			홍길동 70 88 77
			이순신 80 68 87
			고길동 70 80 90
			홍길순 77 56 80
		*/
		
		Student s1 = new Student_Sub("홍길동",70,80,90);
		Student s2 = new Student_Sub("이순신",80,68,87);
		Student_Sub s3 = new Student_Sub("고길동",70,80,90);
		Student_Sub s4 = new Student_Sub("홍길순",77,56,80);

		Student[] arr = new Student[] {s1,s2,s3,s4};
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i].sum_avg();
//		}
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		
		int[] sum =new int[] {sumKor,sumEng,sumMath};
		
		for (int i = 0; i < arr.length; i++) {
			sum[0] += ((Student_Sub)arr[i]).kor;
			sum[1] += ((Student_Sub)arr[i]).eng;
			sum[2] += ((Student_Sub)arr[i]).math;
		}
		System.out.println("국어 점수 총 합 : " + sum[0]);
		System.out.println("영어 점수 총 합 : " + sum[1]);
		System.out.println("수학 점수 총 합 : " + sum[2]);
		
	}
}