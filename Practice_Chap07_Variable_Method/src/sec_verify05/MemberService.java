package sec_verify05;

public class MemberService {
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			System.out.println("hong�� �α��� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("ID�� Ȯ�����ּ���!");
		}
		return true;
	}
	
	void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("hong�� �α׾ƿ� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("ID�� Ȯ�����ּ���!");
		}
	}
}
