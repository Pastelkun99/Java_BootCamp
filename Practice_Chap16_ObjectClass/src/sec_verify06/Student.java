package sec_verify06;

public class Student {

	public String nID;
	public String szName;
	
	public Student(String nID, String szName) {
		this.nID = nID;
		this.szName = szName;
	}
	
	public String toString() {
		return "ID��  " + this.nID + " , Name�� " + this.szName; 
	}
	
	public Student getStudent() {
		Student cloned = null;
		try {
			cloned = (Student)this.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("student �ν��Ͻ�2 : null");
		}
		return cloned;
	}
}
