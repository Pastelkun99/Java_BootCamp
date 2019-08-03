package sec_verify04_2;

public class WithdrawThread1 extends Thread {

	
	private Account account;
	
	public void setAccount(Account account) {
		this.account = account;
		this.setName("¾î¸Ó´Ï");
	}
	
	@Override
	public void run() {
		account.setBalance(1000);
		account.withDraw(500);
		account.withDraw(300);
	}
}
