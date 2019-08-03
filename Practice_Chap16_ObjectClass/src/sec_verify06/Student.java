package sec_verify06;

public class Student {

	public String nID;
	public String szName;
	
	public Student(String nID, String szName) {
		this.nID = nID;
		this.szName = szName;
	}
	
	public String toString() {
		return "ID는  " + this.nID + " , Name은 " + this.szName; 
	}
	
	public Student getStudent() {
		Student cloned = null;
		try {
			cloned = (Student)this.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("student 인스턴스2 : null");
		}
		return cloned;
	}
}
