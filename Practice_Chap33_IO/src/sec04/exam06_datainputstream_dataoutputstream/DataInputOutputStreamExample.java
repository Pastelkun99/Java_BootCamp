package sec04.exam06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		// �⺻ Ÿ���� �����Ͱ� ����Ǳ� ������, .txt�� �������� �ʰ�,
		// .dat Ȯ���ڸ� �̿��Ͽ� FileOutputstream�� �����Ͽ���.
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\exam09\\primitive-type_save.dat");
		
		// ������ ũ�⸦ �˾ƺ��� ���ؼ� �����Ͽ���.
		File file = new File("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\exam09\\primitive-type_save.dat");
		
		// �׸��� �⺻ Ÿ���� ����ϱ� ���� ������Ʈ������ DataOutputStream�� �����Ͽ���.
		DataOutputStream dos = new DataOutputStream(fos);
		
		// ������ ó���� �⺻������ 0����Ʈ�� �����Ѵ�.
		System.out.println("���� ũ�� : " + file.length());
		
		// String�� ���Ͽ� �����ϱ� ���ؼ��� writeUTF�� ����Ѵ�.
		dos.writeUTF("������");
		dos.writeDouble(100.4);
		dos.writeInt(10);
		// ������, �����ϸ鼭 �⺻�� ���� �ý����� ũ�Ⱑ 2Kbyte�� �����ϴ� ���� �� �� �ִ�.
		System.out.println("���� ũ�� : " + file.length());
		
		dos.writeUTF("�迬��");
		dos.writeDouble(96.3);
		dos.writeInt(27);
		System.out.println("���� ũ��(byte) : " + file.length()); //46����Ʈ�� ����Ǿ���.
		
		// �ڿ� ����
		dos.flush();
		dos.close();
		fos.close();
		System.out.println();
		
		// ������ ������ ������ �б� ���� �Ʒ��� ���� FileinputStream�� DataInputStream�� �����ߴ�.
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\Desktop\\������\\���� ���� �͵�\\JAVA ����\\29. IO��� �����\\exam09\\primitive-type_save.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		// ���� ���� �����Ҷ��� ������ �Ȱ��� �о�;� �Ѵ�.
		for(int i = 0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println("���� ���ڿ� : " + name);
			System.out.println("���� double �� : " + score);
			System.out.println("���� Int �� : " + order);
			System.out.println();
		}
		System.out.println("���� ũ��(byte) : " + file.length()); 	// 46����Ʈ�� ������
		// �ڿ�����
		dis.close();
		fis.close();
		
	}
}
