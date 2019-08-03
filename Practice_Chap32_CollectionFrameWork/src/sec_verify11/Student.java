package sec_verify11;

public class Student {

	private int studentNum;
	private String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return this.studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student)obj;
			return st.name.equals(this.name) || st.studentNum == this.studentNum;
		}
		
		else {
			return false;
		}
	}
	
	/*@Override
	public String toString() {
		return "학번 : " + this.studentNum + " 이름 : " + this.name + "\n";
	}*/
	
}
