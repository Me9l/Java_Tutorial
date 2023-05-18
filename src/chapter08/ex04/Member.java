package chapter08.ex04;

import java.util.UUID;

import lombok.*;

@Getter @Setter @ToString
public class Member {
	private long memberNo ;
	private UUID memberId ;
	private String memberPw ;
	private String memberEmail ;
	private int memberAge ;
}
