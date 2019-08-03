package sec07_Exam_Singleton;

public class SingletonExample {

	public static void main(String[] args) {
		
		//Singleton obj1 = new Singleton(); 			private�� �����߱� ������ �ش� Ŭ������ �ƴ� �ٸ� Ŭ�������� new�� ���� ȣ�� �� �� ���� ����.
		//Singleton obj2 = new Singleton();
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		//����� ���� Ŭ������ Object�� equals()ȣ�� --> ���� ��
		if(obj1.equals(obj2))
			System.out.println("���� Singleton ��ü�Դϴ�.");
		else
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");

	}

}