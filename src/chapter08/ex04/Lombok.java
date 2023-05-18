package chapter08.ex04;

import lombok.*;

@Data
public class Lombok {
		private String name;
		private String email;
		private int age;
		private int grade;
		// lombok 설치
		// cmd > java -jar lombok.jar
		// eclipse.ini 파일에 등록 되었는지 확인해본다.
		// Lombok				: 클래스 바로 윗 라인에 정의.
		// @Getter				: getter 생성.
		// @Setter				: setter 생성.
		// @ToString			: toString 생성.
		// @NoArgsConstructor	: 기본 생성자 생성.
		// @AllArgsConstructor	: 모든 생성자 생성.
		// @Data	: ( Getter, Setter, ToString, NoArgsConstructor, hashCode, equals, canEqual ) 자동 생성
		
		// 라이브러리 : 클래스(기능)들의 묶음 (.jar)	// 내가 만드는 것을 편하도록 도와주는 툴.
		// 프레임워크 : Spring, Spring boot
		//				정해진 규칙안에서 내가 살을 붙여 만듦.
		//				코드가 간결해지고 보안에 안정적
	}
