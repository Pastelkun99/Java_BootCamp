package sec11_verify;

public class TaskExample {

	public static void main(String[] args) {

		
		System.out.println("☆☆☆ 나의 우선순위별 업무리스트 ☆☆☆");
		
		System.out.printf("일의 이름\t소요시간(분)\t우선순위\n");
		Task task1 = new Task("영어공부", 30);
		task1.setPriority(3);
		Task task2 = new Task("수학공부", 80);
		task2.setPriority(1);
		Task task3 = new Task("자바공부", 150);
		task3.setPriority(2);

		System.out.printf(task1.taskname + "\t" + task1.time + "분\t\t" + task1.priority_number);
		System.out.println();
		System.out.printf(task2.taskname + "\t" + task2.time + "분\t\t" + task2.priority_number);
		System.out.println();
		System.out.printf(task3.taskname + "\t" + task3.time + "분\t\t" + task3.priority_number);
	}

}
