package sec11_verify;

public class TaskExample {

	public static void main(String[] args) {

		
		System.out.println("�١١� ���� �켱������ ��������Ʈ �١١�");
		
		System.out.printf("���� �̸�\t�ҿ�ð�(��)\t�켱����\n");
		Task task1 = new Task("�������", 30);
		task1.setPriority(3);
		Task task2 = new Task("���а���", 80);
		task2.setPriority(1);
		Task task3 = new Task("�ڹٰ���", 150);
		task3.setPriority(2);

		System.out.printf(task1.taskname + "\t" + task1.time + "��\t\t" + task1.priority_number);
		System.out.println();
		System.out.printf(task2.taskname + "\t" + task2.time + "��\t\t" + task2.priority_number);
		System.out.println();
		System.out.printf(task3.taskname + "\t" + task3.time + "��\t\t" + task3.priority_number);
	}

}
