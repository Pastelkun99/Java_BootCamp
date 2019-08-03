package sec_verify02;

public class Player {

	private String name;
	private int age;
	private int backNumber;
	protected int spd;
	
	public Player() {
		
	}
	
	public Player(String name, int age, int backNumber, int spd) {
		this.name = name;
		this.age = age;
		this.backNumber = backNumber;
		this.spd = spd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}
	
	public void setSpd(int spd) {
		this.spd = spd;
	}
	
	public String getname() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getBackNumber() {
		return this.backNumber;
	}
	
	public int getSpd() {
		return this.spd;
	}
	
	public void infoPrint() {
		System.out.println("이름 : " + this.name );
		System.out.println("나이 : " + this.age);
		System.out.println("등번호 : " + this.backNumber);
		System.out.println("스피드 : " + this.spd);
	}
}
