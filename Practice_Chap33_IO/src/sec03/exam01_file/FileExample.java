package sec03.exam01_file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

   public static void main(String[] args) throws Exception {
      File dir = new File("C:/Temp/dir");
      File file1 = new File("C:/Temp/file1.txt");
      File file2 = new File("C:/Temp/file2.txt");
      File file3 = new File(new URI("file:///C:/temp/file3.txt"));
      //���� PC�̱� ������ localhost�� �����ص� �����ϴ�.
      
      //URI�� ���� ���� �ڿ� �ĺ���(Uniform Resource Identifier, URI)�� ���ͳݿ� �ִ� �ڿ��� ��Ÿ���� ������ �ּҸ� ���Ѵ�.
      //URI�� ����� ���ͳݿ��� �䱸�Ǵ� �⺻�������μ� ���ͳ� ��������(��� ���)�� �ٴ´�.
      //���� ���α׷��ֿ��� ���� ������ ������ �˵��� ����.
      //�������� (HTTP Ȥ�� FTP) + : + / + ȣ��Ʈ�̸� + �ּ�
      
      //���� IP�ּҳ� ȣ��Ʈ�ּҰ� �;��Ѵ�.
      //File file3 = new File(new URI("file://localhost/C:/temp/file3.txt"));
      //URI�� �����̶�� scheme�� �ʿ��ϴ�.
      //URIǥ����� ������ �ƴ��ϸ� IllegalArgumentException���� �߻���
      //File file3 = new File(new URI("C:/temp/file3.txt"));
      
      //dir���丮�� �����ϴ���?
      if(dir.exists() == false) {
         //dir.mkdir();   //�θ���丮�� �������� �ƴ��ϰ� �ڽŸ� �����Ѵ�.
         //��λ� ���� ���丮�� �� �����Ѵ�.(�����Ѵ�.) �־ ����ϱ� ���̴�.
         dir.mkdirs();
      }
      if(file1.exists() == false) {
         //���� C:/Temp/file1.txt��ο� Temp���丮�� ���ٸ� IOException�� �߻��ϹǷ� 
         //�ݵ�� ���丮 �����̳� ��θ� �� �����ؾ� �Ѵ�.
         file1.createNewFile();
      }
      if(file2.exists() == false) {   file2.createNewFile(); }
      if(file3.exists() == false) {   file3.createNewFile(); }
      
      //File��ü�� �ϳ� �����.
      File temp = new File("C:/Temp");
      //Temp ���� ������丮 �� ������ ���� �迭�� �����Ͽ� ������
      File[] contents = temp.listFiles();
      
      System.out.println("��¥\t\t�ð�\t����\t\tũ��\t\t�̸�");
      System.out.println("----------------------------------------------------------------");
      
      //������¥�� ������¸� �����ϱ� ���� �Ʒ��� ���� SimpleDateFormat��ü�� �����Ѵ�.
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a  HH:hh");
      
      //���� ���� File[]�� ����غ���.
      for(File file : contents) {
         //������ ������ ��¥�� �Ű������� Date��ü�� �����Ͽ� SimpleDateFormat��ü�� format()�� �Ű�Ÿ������ �ش�.
         System.out.print(sdf.format(new Date(file.lastModified())));
         
         //file�� ���丮�̳�?
         if(file.isDirectory()) {
            //���丮 �̸��� ���
            System.out.print("\t<DIR>\t\t" + file.getName());
         }
         //file�̸�
         else {
            //���� ũ��� �̸� ���
            System.out.print("\t\t\t" + file.length() + "\t\t" + file.getName());
         }
         System.out.println();
      }
   }
}