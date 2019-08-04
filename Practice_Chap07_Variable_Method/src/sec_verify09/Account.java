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
			System.out.println("입금하신 금액이 - 이거나 백만원을 초과했음");
		} else {
			System.out.println("현재 잔고 : " + balance);
		}
		return balance;
	}
}
