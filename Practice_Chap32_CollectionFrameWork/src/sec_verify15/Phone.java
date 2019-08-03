package sec_verify15;

public class Phone {

	private String name;
	private String address;
	private String telNum;
	
	public Phone(String name, String address, String telNum) {
		this.name = name;
		this.address = address;
		this.telNum = telNum;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getTelNum() {
		return telNum;
	}
	
	@Override
	public String toString() {
		return "이름 : " + getName() + "\n"
				+ "주소 : " + getAddress() + "\n"
				+ "전화번호 : " + getTelNum() + "\n";
	}
}
