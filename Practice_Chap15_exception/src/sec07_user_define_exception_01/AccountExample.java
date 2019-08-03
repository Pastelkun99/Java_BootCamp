package sec07_user_define_exception_01;

public class AccountExample {

	public static void main(String[] args) {

		Account ac = new Account();
		//�����ϱ�
		
		ac.deposit(10000);
		System.out.println("���ݾ� : " + ac.getBalance());
		
		//����ϱ�(���ܹ߻�ó���ڵ带 ���� �ۼ��ؾ���)
		
		try {
			//ac.withdraw(1000);
			ac.withdraw(30000);
			System.out.println("����� �Ǿ����ϴ�.");
			System.out.println("���ܾ� : " + ac.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			//�����Ҷ� ����Ѵ�. ���߿Ϸ�� �ּ�ó���� �ϴ��� ������ �ϴ� ���� �ٶ����ϴ�.
			e.printStackTrace();
			//System.out.println(e.toString()); //������ ������Ҷ� ���
		}
	}

}
