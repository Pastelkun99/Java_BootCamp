package sec05.exam03_treeset_search;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample_Search {

	public static void main(String[] args) {
		
		// String�� �����ϴ� treeSet�� ����.
		TreeSet<String> treeSet = new TreeSet<String>();
		
		// ���ĺ��� �����ڵ忡 ���� ����Ʈ���� ���� �������� ����
		treeSet.add("apple");
		treeSet.add("f");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("guess");
		treeSet.add("cherry");
		/*treeSet.add("����");
		treeSet.add("����");
		treeSet.add("�ٽô�");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");*/
		
		// ���⼭ �򰥸� ���� �ִµ�, c ~ f���̶�� ���� ������ c���� �ؼ� ���� f�κ��� �Ѿ�� �ȵȴٴ� ���� �ǹ��Ѵ�.
		// �ٽø��� f�� ����ϳ� forever ��, orever������ forever�� ����� ���� �ʴ� ���� �˵��� ����. �ѱ� ���� ��������
		System.out.println("[c~f] ������ �ܾ� �˻�");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for(String str : rangeSet) {
			System.out.print(str + " ");
		}
		
		/*System.out.println("[��~��] ������ �ܾ� �˻�");
		NavigableSet<String> rangeSet = treeSet.subSet("��", true, "��", true);
		for(String str : rangeSet) {
			System.out.println(str + " ");
		}*/
		
	}
}
