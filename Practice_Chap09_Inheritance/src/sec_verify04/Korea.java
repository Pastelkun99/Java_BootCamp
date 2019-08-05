package sec_verify04;

public class Korea extends Asia {

	String country = "Korea";

	@Override
	public String toString() {
		return "내가 살고 있는 나라 : " + this.country + "이며, 내 나라는 " + super.country + "에 속합니다.";
	}
}
