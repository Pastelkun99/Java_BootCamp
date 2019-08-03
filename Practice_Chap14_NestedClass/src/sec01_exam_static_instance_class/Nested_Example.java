package sec01_exam_static_instance_class;

public class Nested_Example {
	//�ν��Ͻ� ���Ŭ����
	class InstanceClass {
		int iv = 100;
		//static int cv = 200; <- �ν��Ͻ��� �����ؾ߸� �� �� �ִ³���.
		final static int CONST = 100; //final static�� ����̹Ƿ� ���
	}
	
	//�������Ŭ����
	static class staticInner {
		int iv = 200;   //�������Ŭ������� �ص� �ν��Ͻ������ ���� �� �ִ�.
						// ������ ����ϱ� ���ؼ��� new �� �ν��Ͻ���
						// �����ؾ����� ��������.
		static int cv = 200;
	}
	
	void method() {
		//����Ŭ����(�޼��� �ȿ� ����, ��� ����� �뵵)
		class Localclass {
			int iv = 300;
			//static int cv = 300; -> �ν��Ͻ� ������ �ȴٰ�
			static final int CONST = 300;
		}
		
		//����Ŭ������ �ش� �޼��� �������� ��밡���ϴ�.
		Localclass lc = new Localclass();
		System.out.println(lc.iv);
		System.out.println(lc.CONST);
	}
	void method1() {
		class Localclass {
			int iv = 300;
			//static int cv = 300 -> ������. ������ ����
			static final int CONST = 300;
		}
		//����Ŭ������ �ش� �޼��� �������� ��밡���ϴ�.
		Localclass lc = new Localclass();
		System.out.println(lc.iv);
		System.out.println(lc.CONST);
		
	}
	
	public static void main(String[] args) {
		Nested_Example ne = new Nested_Example();
		//�ν��Ͻ� ��� Ŭ������ �ܺ� Ŭ������ �ν��Ͻ��� �־�߸� ��밡���ϴ�.
		InstanceClass ic = ne.new InstanceClass();
		//���� Ŭ������ �ܺ� Ŭ������ �ν��Ͻ��� ��� �ٷ� ��밡���ϴ�.
		Nested_Example.staticInner si = new staticInner();
		
		System.out.println(ic.iv);
		System.out.println(ic.CONST);
		System.out.println(si.iv);
		System.out.println(staticInner.cv);
		ne.method();
	}
}

