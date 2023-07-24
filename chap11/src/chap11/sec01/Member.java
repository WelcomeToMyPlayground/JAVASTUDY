package chap11.sec01;

public class Member {
	
	public String  id;
	
	public Member(String id) {
		this.id=id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj; // Object 타입 obj 를 Member 타입으로 강제 변환
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
}
