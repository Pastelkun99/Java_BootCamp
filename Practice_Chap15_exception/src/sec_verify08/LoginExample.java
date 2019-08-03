package sec_verify08;

public class LoginExample extends Object {

	public static void main(String[] args) {

		System.out.println("아이디는 white이며, 비밀번호는 12345입니다.");
		login("white ", "12345");
		login("white", "54321");
	}

	
	public static void login(String id, String pw) {
		
		
		try {
			if(!id.equals("white")) {
				throw new NotExistIDException(id);
			}
			else if(!pw.equals("12345")) {
				throw new WrongPasswordException(pw);
			}	
		}
		catch (WrongPasswordException | NotExistIDException e) {
			if(e instanceof WrongPasswordException) {
				System.out.println("비밀번호가 " + pw + "가 아닙니다.");
			}
			else if(e instanceof NotExistIDException) {
				System.out.println(id + "란 아이디가 존재하지 않습니다.");
			}
		}
		
		
	}
}
