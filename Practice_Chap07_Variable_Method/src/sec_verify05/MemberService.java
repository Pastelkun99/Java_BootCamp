package sec_verify05;

public class MemberService {
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			System.out.println("hong이 로그인 되었습니다.");
		}
		else {
			System.out.println("ID를 확인해주세요!");
		}
		return true;
	}
	
	void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("hong이 로그아웃 되었습니다.");
		}
		else {
			System.out.println("ID를 확인해주세요!");
		}
	}
}
