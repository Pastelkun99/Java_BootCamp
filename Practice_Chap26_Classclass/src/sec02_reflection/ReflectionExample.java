package sec02_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	
	//�Ű������� ����ϴ� �޼��� ����ϰ� ����ϰ� �� ��� �޼���� ����
	//ȣ�⸸ �ϴ� ���� �ٶ����� ����̴�.
	
	private static void printParameters(Class[] parameters) {
		for(int i = 0; i<parameters.length; i++) {
			System.out.print(parameters[i].getSimpleName());
			if(i<(parameters.length-1))
				System.out.print(", ");
		}
	}

	public static void main(String[] args) throws Exception {
		
		Class clazz = Class.forName("sec02_reflection.Car");
		System.out.println("[Ŭ���� �̸�]" + clazz.getName());
		System.out.println("[Ŭ���� �̸�]" + clazz.getSimpleName());
		System.out.println();
		
		System.out.println("[������ ����]");
		//Car Ŭ�������� ����� ������ ������ ���(���������ڿ� �������)
		Constructor[] constructors = clazz.getDeclaredConstructors();
		
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			
			//�������� �Ű����� Ÿ�� ���� ���
			Class[] parameters = constructor.getParameterTypes();
			
			for(int i = 0; i<parameters.length; i++) {
				System.out.print(parameters[i].getSimpleName());		//������ �Ű����� Ÿ�� ���
				//��ǥ�� �����ϰ��� ��
				if(i<(parameters.length-1)) {
					System.out.print(", ");
				}
			}
			//printParameters(parameters)
			System.out.println(")");
		}
		System.out.println();
		
		//Car Ŭ�������� ����� �ʵ� ������ ���(���������ڿ� �������)
		System.out.println("[�ʵ� ����]");
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field field : fields)
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		System.out.println();
		
		//CarŬ�������� ����� �޼��� ������ ���(���������ڿ� �������)
		System.out.println("[�޼��� ����]");
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method method : methods) {
			System.out.print(method.getReturnType().getSimpleName() + " ");		//����Ÿ�� ���� ���
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();		//�޼����� �Ű����� Ÿ������ ���
			printParameters(parameters);		//���� �޼��� ȣ��
			System.out.println(")");
			
		}
	}

}