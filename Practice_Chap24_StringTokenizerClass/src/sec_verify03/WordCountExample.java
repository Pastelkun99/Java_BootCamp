package sec_verify03;

import java.util.Arrays;
import java.util.Scanner;

public class WordCountExample {

	public static void main(String[] args) {


		System.out.println("���� �� �ܾ ���ϴ� ���α׷��Դϴ�.(���� : Ctrl+z)");
		System.out.println("���ڿ��� �Է��ϼ���. (������ ���ڿ��� ������)");
		System.out.println("�Է� : ");
		String forinput = "";
		String delimiter = " ";
		String[] strarr = new String[101];
		try {
			while(true) {
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			forinput += input + " ";
			}
		} catch (Exception e) {
			strarr = forinput.split(delimiter);
			for (int i = 0; i < strarr.length - 1; i++)
		    {
		        for (int j = 0; j < strarr.length-1-i; j++)
		        {
		            if (strarr[j].length() < strarr[j+1].length())
		            {
		            	String temp = "";
		                temp = strarr[j];
		                strarr[j] = strarr[j+1];
		                strarr[j+1] = temp;
		            }
		        }
		    }
			System.out.println(Arrays.toString(strarr));
			}
			System.out.println("���� �� �ܾ�� " + strarr[0] + "�Դϴ�.");
			System.exit(0);
		}
		
	}

