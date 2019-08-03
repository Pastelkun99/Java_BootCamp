package sec01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		//DATEŬ������ Time-stamp������� ���� ����Ѵ�.
		Date now = new Date();	//���� �ý����� ��¥�� �ð��� ����
		String strNow1 = now.toString();
		System.out.println(strNow1);
		// KST - �ѱ� ǥ�ؽ�
		
		//DateŬ������ ���� �ν��Ͻ� ������ SimpleDateformatŬ������ format()��
		//�̿��ؼ� ���ϴ� ���·� ����� �� �ִ�.
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
