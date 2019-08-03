package sec_verify04_2;

public class AccountExample {

	public static void main(String[] args) {
		
		Account acnt = new Account();
		WithdrawThread1 w1 = new WithdrawThread1();
		WithdrawThread2 w2 = new WithdrawThread2();
		
		w1.setAccount(acnt);
		w2.setAccount(acnt);
		w1.start();
		w2.start();
	}
}
