package sec_verify08;

public class LoginExample extends Object {

	public static void main(String[] args) {

		System.out.println("���̵�� white�̸�, ��й�ȣ�� 12345�Դϴ�.");
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
				System.out.println("��й�ȣ�� " + pw + "�� �ƴմϴ�.");
			}
			else if(e instanceof NotExistIDException) {
				System.out.println(id + "�� ���̵� �������� �ʽ��ϴ�.");
			}
		}
		
		
	}
}
