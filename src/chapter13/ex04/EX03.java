package chapter13.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member {
	String memberId;		// 식별자 equals(), hashCode()
	String memberName;
	
	// 생성자를 통해 필드 값 입력 (1)
	public Member(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	// Override toString() (2)
	@Override
	public String toString() {
		return "ID :" + memberId + ", Name : " + memberName;
	}	

	// 중복값 식별을 위해 equals(), hashCode() Override (3)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(memberId, other.memberId);
	}
//	@Override
//	public boolean equals(Object obj) {
//		if ( obj instanceof Member ) {
//			if (this.memberId == ((Member)obj).memberId) {
//				return true;
//			}
//		}return false;
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}
}

class MemberMethod {
	// Set 정의.
	Set<Member> mSet ;
	
	// MemberMethod 객체 생성시 Set을 활성화.
	MemberMethod () {
		this.mSet = new HashSet<>();
	}
	
	// Method 정의.
	public void addMember(Member member) {	// member 객체를 받아 set에 저장.	(5)
		mSet.add(member);
	}
	
	// memberId를 정수로 받아서, Set의 member 아이디 검색 (Iterator)
	// input받은 memberId 와 Set의 Id가 같을 경우 삭제.
	public boolean removeMember(String memberId) {		// (12)
		Iterator<Member> itr = mSet.iterator();		// mSet을 iterator화
		
		while(itr.hasNext()) {						// 전체 탐색
			Member member = itr.next();
			
			if( memberId == member.memberId ) {		// 아이디가 같은지확인
				mSet.remove(member);
				return true;
			}
		}
		System.out.println("확인되지 않음.");
		return false;
	}
	
	// Set에 저장된 member 객체의 필드 값 출력.
	public void showMember() {			// Iterator로 set의 값 출력. (10)
		Iterator<Member> itr = mSet.iterator();
		while( itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	// Set에 저장된 member 의 총 갯수 출력.
	public void showSize() {
		System.out.println("Set에 저장된 수 : " + mSet.size()); // size()로 출력 (8)
	}

	@Override
	public String toString() {
		return mSet + "";
	}
	
}

public class EX03 {
	public static void main(String[] args) {
		// Member 객체 생성
		Member m1 = new Member("000","운영자");	// 객체생성 (4)
		Member m2 = new Member("100","유저백");
		Member m3 = new Member("200","홍길동");
		Member m4 = new Member("100","게스트");
		// MemberMethod 의 method를 이용해 추가/삭제/조회

		// MemberMethod 를 통해 set에 접근.
		MemberMethod method = new MemberMethod();		// 객체생성 (6)
		method.addMember(m1);							// 객체입력 (7)
		method.addMember(m2);
		method.addMember(m3);
		method.addMember(m4);
		
		method.showSize(); 				// 메소드 호출 (9)
		method.showMember();			// 메소드 호출 (11)
		method.removeMember("100");
		System.out.println("---------------------");
		method.showMember();			// 메소드 호출 (13)
	}
}
