package sec01_equals;

public class Member {

	String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//�Ű������� Object�� �ִ�. ���ǹ̴�?
	
	@Override
	public boolean equals(Object obj) {
		
		//Ÿ�Ժ�ȯ�� Ȯ���ϱ����� instanceof ������
		System.out.println("equals()ȣ��");
		
		if(obj instanceof Member) {
			//obj�� MemberŸ������ ������ȯ
			Member member = (Member)obj;
			
			//���� ������ ���� ���ǹ� ����
			if(this.id.equals(member.id))
				return true;
		}
		return false;
	}
}
