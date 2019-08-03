package sec_verify15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookApp {

	final int INSERT = 1;
	final int DELETE = 2;
	final int SEARCH = 3;
	final int SHOWALL = 4;
	final int EXIT = 5;
	
	private Scanner scanner;
	private HashMap<String, Phone> map;
	
	public PhoneBookApp() {
		scanner = new Scanner(System.in);
		map = new HashMap<>();
		System.out.println(" ------------------------------------------ ");
		System.out.println("��ȭ��ȣ ���� �ý����� �����մϴ�.");
		System.out.println(" ------------------------------------------ ");
	}
	
	public void run() {
		while(true) {
		System.out.print("1: ����, 2: ����, 3: ã��, 4: ��ü����, 5: ���� >> ");
		int status = scanner.nextInt();
		switch(status) {
		case INSERT : 
			insert();
			break;
		case DELETE : 
			delete();
			break;
		case SEARCH :
			search();
			break;
		case SHOWALL :
			showall();
			break;
		case EXIT :
			System.out.println("���α׷��� �����մϴ�...");
			System.exit(0);
			break;
		}
		}
	}
	
	public void insert() {
		System.out.print("�̸� >> ");
		String name  = scanner.next();
		if(map.get(name) != null) {
			System.out.println(name + "���� �̹� ��ϵǾ����ϴ�.");
			System.out.println();
			return;
		}
		System.out.print("�ּ� >> ");
		String address = scanner.next();
		System.out.print("��ȭ��ȣ >> ");
		String telnum = scanner.next();
		System.out.println(name + "���� ����Ǿ����ϴ�.");
		map.put(name, new Phone(name, address, telnum));
		System.out.println();
		
	}
	
	public void delete() {
		System.out.print("�̸� >> ");
		String name = scanner.next();
		if(map.get(name) == null) {
			System.out.println(name + "���� �������� �ʴ� �̸��Դϴ�.");
			return;
		}
		map.remove(name);
	}
	
	public void search() {
		System.out.print("�̸� >> ");
		String name = scanner.next();
		if(map.get(name) == null) {
			System.out.println(name + "���� ��ϵ��� ���� ����Դϴ�.");
			return;
		}
		Phone p = map.get(name);
		System.out.println(p.toString());
	}
	
	public void showall() {
		System.out.println("���� ����Ǿ� �ִ� �� ���� ����Ʈ�Դϴ�.");
		Set<String> keyset = map.keySet();
		Iterator<String> keyit = keyset.iterator();
		while(keyit.hasNext()) {
			String key = keyit.next();
			Phone p = map.get(key);
			System.out.println(p.toString());
		}
	}
}
