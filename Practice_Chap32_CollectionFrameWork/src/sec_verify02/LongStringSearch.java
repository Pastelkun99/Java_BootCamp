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
		System.out.println(emp + "만큼의 ArrayList가 생성되었습니다.");
	}
	
	public void addString (String str) {
		stringlist.add(str);
	}
	
	public void listPrint() {
		System.out.println("ArrayList에 들어 있는 모든 이름을 출력합니다.");
		for(int i = 0; i<stringlist.size(); i++) {
			System.out.println((i+1) + "번째 ArrayList객체 값 : " + stringlist.get(i));
		}
	}
	
	public String longestString() {
		int longestIndex = 0;
			for(int i = 1; i<stringlist.size(); i++) {
				if(stringlist.get(longestIndex).length() < stringlist.get(i).length()) {
					longestIndex = i;
				}
			}
			System.out.println("\n 가장 긴 이름은 : " + stringlist.get(longestIndex));
			return null;
	}
	
}
