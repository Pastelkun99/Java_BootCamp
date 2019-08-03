package sec07_user_define_exception_01;

public class Account {

	private long balance;
	
	public Account() {}
	
	//���ܾ� ��������
	public long getBalance() {
		return this.balance;
	}
	
	//�Ա��ϱ�
	public void deposit(int money) {
		this.balance += money;
	}
	
	//����ϱ� (���� �Ǵ����� �ϰ� �ִ�.)
	public void withdraw(int money) throws BalanceInsufficientException {
		//�ܰ��� ��ݾ��� ���ٸ� ������ ���� �߻���Ŵ
		if(this.balance < money)
			throw new BalanceInsufficientException("�ܰ���� : " + (money-this.balance) + "���ڶ�.");
		this.balance -= money;
	}
}
