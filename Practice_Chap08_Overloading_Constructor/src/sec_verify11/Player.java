package sec_verify11;

import java.util.Scanner;

public class Player {

	Scanner scanner; //Ű���� �Է�
	private String name;      //���� �������� �̸�
	private String word; 
	   
	//final int NUM=0;
	   
	public Player (String name)      //�ʱ�ȭ �� ��ĳ�� ����
	{
	 this.name = name;
	 scanner = new Scanner(System.in);
	}
	   
	public String getName()
	{
	return this.name;
	}
	
	public String sayWord()
	{
	      System.out.print(name + ">>");
	      word = scanner.next();
	      return word;
	}
	   //lastWord�� �����ڰ� ���� word�� ���Ͽ� �����ձⰡ �ߵǾ����� �Ǵ�.
	   //�����Ϸ��� true ����
	public boolean succeed(String lastWord)   //charAt()���
	   {
	      int lastIndex = lastWord.length()-1; //���� �ܾ��� �� ������ ������ �ε���
	      //���� �ܾ��� �� ������ ���ڿ� �����ڰ� ���� �ܾ��� ù ���ڰ� ������ ��
	      if(lastWord.charAt(lastIndex) == word.charAt(0))
	         return true;
	      else
	         return false;
	      }
}
