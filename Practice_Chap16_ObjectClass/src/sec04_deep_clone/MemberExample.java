package sec04_deep_clone;

import java.util.Arrays;

public class MemberExample {

	public static void main(String[] args) {

		Member original = new Member("ȫ�浿", 25, new int[] {90, 100}, new Car("�ҳ�Ÿ"));
		
		Member cloned = original.getMember();		//���� ������ �ν��Ͻ��� ������ ��
		//���� ������ �ߴٸ� ���� ��ü�� ���� ���������, ���� ������ �߱� ������ ������ü�� ������ Ÿ�Կ� ������ ��ġ�� ����.
		
		cloned.scores[0] = 9999;	
		cloned.car.model = "�׷���";
		
		System.out.println("[���� ��ü�� �ʵ� ��]");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.println(Arrays.toString(original.scores));
		System.out.println("car : " + original.car.model);
		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ� ��]");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.println(Arrays.toString(cloned.scores));
		System.out.println("car : " + cloned.car.model);
	
	}

}
