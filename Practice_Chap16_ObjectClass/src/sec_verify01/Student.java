package sec_verify01;

public class Student {

	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getstudentNum() {
		return this.studentNum;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(studentNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student cstu = (Student)obj;
			if(this.studentNum == cstu.studentNum) {
				return true;
			}
		}
		return false;
	}
}
