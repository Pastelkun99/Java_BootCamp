package sec_verify03;

import java.util.ArrayList;

public class AddressPerson {

	private ArrayList<Person> db;
	
	public AddressPerson() {
		System.out.println("������ ���̽��� �����Ǿ����ϴ�!");
		this.db = new ArrayList<Person>();
		System.out.println();
	}
	
	public int isExists(String s) {
		Person personclass;
		int index = -1;
		
		for(int i = 0; i < db.size(); i++) {
			personclass = db.get(i);
			if((personclass.getName()).equals(s)) {
				index = i;
			}
		}
		return index;
	}
	
	public void print() {
		System.out.println("���� �� ����Ʈ �Դϴ�.");
		System.out.println("-------------------------------------------------------------------------");
		for(int i = 0; i<db.size(); i++) {
			System.out.println("�̸� : " + db.get(i).getName() + ", ���� : " + db.get(i).getAge() + ", ����ó : " + db.get(i).getHandPhone());
		}
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public void insert(Person p) {
		int index = isExists(p.getName());
		if(index == -1) {
			db.add(p);
		}
		else {
			System.out.println(p.getName() + "���� �̹� ��ϵ� ȸ���Դϴ�.");
		}	
		System.out.println();
	}
	
	public void delete(String s) {
		int index = isExists(s);
		if(index == -1) {
			System.out.println(s + "��� ���� �������� �ʽ��ϴ�.");
		}
		else {
			db.remove(index);
			System.out.println(s + "��� ���� �����Ͽ����ϴ�.");
		}
		System.out.println();
	}
	
	public void update(String s, Person p) {
		int index = isExists(s);
		if(index == -1) {
			System.out.println(s + "��� ���� �������� �ʽ��ϴ�.");
		}
		else {
			db.set(index, p);
			System.out.println(s + "�� ������ ������Ʈ �߽��ϴ�.");
		}
		System.out.println();
	}
	
	
	
	
	
}
