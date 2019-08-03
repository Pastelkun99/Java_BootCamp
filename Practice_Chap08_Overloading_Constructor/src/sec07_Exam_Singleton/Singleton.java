package sec07_Exam_Singleton;

public class Singleton {

	//������������ ������ ���� ���� private�� �ٿ��� �ܺο����� new�� ���� �ν��Ͻ� �����Ұ���.
	//static�� Ŭ���� ������ �ö�. ���� �ܺο��� new�����ڸ� ���ؼ� �������� �ʾƵ� ��.
	
	private static Singleton singleton = new Singleton();
	
	//singleton�� �⺻��������. ���� private ���������ڶ� �ܺο��� ���� ����.
	//�����Ϸ��� �⺻ �����ڰ� �����ÿ���, �ڵ������� �˾Ƽ� �⺻�����ڸ� ������.
	
	private Singleton() {}
	
	//static �޼��常 getInstance�� singleton�ּҸ� ������.
	public static Singleton getInstance() {
		
		//return this.singleton; 		//���� �߻� ���� : static������ �ν��Ͻ��� ��ȯ �Ұ���. new�� ���� ���������˰�?
		return Singleton.singleton;
	}
}
