package sec07_user_define_exception_01;

public class BalanceInsufficientException extends Exception {

		public BalanceInsufficientException() {	}
		
		public BalanceInsufficientException(String message) {
			super(message);
		}
}