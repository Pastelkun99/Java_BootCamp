package sec_verify08;

public class NotExistIDException extends Exception {

	public NotExistIDException() {
		
	}
	
	public NotExistIDException(String id) {
		super(id);
	}
}
