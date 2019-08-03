package sec_verify02;

import java.util.ArrayList;
import java.util.Collections;

public class LongStringSearch {

	
	private ArrayList<String> stringlist;
	
	public ArrayList<String> getStringlist() {
		return stringlist;
	}

	public LongStringSearch(int emp) {
		stringlist = new ArrayList<>(emp);
		System.out.println(emp + "��ŭ�� ArrayList�� �����Ǿ����ϴ�.");
	}
	
	public void addString (String str) {
		stringlist.add(str);
	}
	
	public void listPrint() {
		System.out.println("ArrayList�� ��� �ִ� ��� �̸��� ����մϴ�.");
		for(int i = 0; i<stringlist.size(); i++) {
			System.out.println((i+1) + "��° ArrayList��ü �� : " + stringlist.get(i));
		}
	}
	
	public String longestString() {
		int longestIndex = 0;
			for(int i = 1; i<stringlist.size(); i++) {
				if(stringlist.get(longestIndex).length() < stringlist.get(i).length()) {
					longestIndex = i;
				}
			}
			System.out.println("\n ���� �� �̸��� : " + stringlist.get(longestIndex));
			return null;
	}
	
}
