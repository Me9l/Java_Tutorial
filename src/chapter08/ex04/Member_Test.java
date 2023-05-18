package chapter08.ex04;

import java.util.UUID;

public class Member_Test {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setMemberNo(1L);
		m1.setMemberId(UUID.randomUUID());
		m1.setMemberEmail("apple@email.com");
		m1.setMemberAge(20);
		m1.setMemberPw("pwispw");
		
		System.out.println(m1.getMemberNo());
		System.out.println(m1.getMemberId());
		System.out.println(m1.getMemberEmail());
		System.out.println(m1.getMemberAge());
		System.out.println(m1.getMemberPw());
		
		System.out.println(m1);
		System.out.println(m1.toString());
	}
}
