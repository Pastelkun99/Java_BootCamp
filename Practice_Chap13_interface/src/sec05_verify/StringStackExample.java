package sec05_verify;

public class StringStackExample {

	public static void main(String[] args) {

		StringStack sst = new StringStack(5);
		sst.length();

		sst.push(sst);
		sst.pop();
	}

}
