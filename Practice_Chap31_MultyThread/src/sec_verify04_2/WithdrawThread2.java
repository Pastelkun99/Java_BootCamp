package sec_verify04_2;

public class WithdrawThread2 extends Thread {


	private Account account;
	
	public void setAccount(Account account) {
		this.account = account;
		this.setName("พฦต้");
	}
	
	@Override
	public void run() {
		this.account.withDraw(300);
	}
}
