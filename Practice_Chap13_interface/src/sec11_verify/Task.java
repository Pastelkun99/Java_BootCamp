package sec11_verify;

public class Task implements Priority {

	String taskname;
	int time;
	int priority_number;

	public Task(String taskname, int time) {
		this.taskname = taskname;
		this.time = time;
	}

	@Override
	public int getPriority() {
		return priority_number;
	}

	@Override
	public void setPriority(int prioity_number) {
		this.priority_number = prioity_number;
	}

}
