package sec_verify09;

public class Account {

	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	int balance;

	public int getBalance() {
		return balance;
	}

	public int setBalance(int balance) {
		if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
			System.out.println("�Ա��Ͻ� �ݾ��� - �̰ų� �鸸���� �ʰ�����");
		} else {
			System.out.println("���� �ܰ� : " + balance);
		}
		return balance;
	}
}
