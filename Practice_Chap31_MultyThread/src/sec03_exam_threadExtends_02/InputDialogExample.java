package sec03_exam_threadExtends_02;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class InputDialogExample {

	public static void main(String[] args) {
		
		TimerThread t = new TimerThread();
		t.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		
		/*Frame f = new Frame();
		TextField tf = new TextField(10);
		f.setLayout(new FlowLayout());
		f.setBounds(500, 500, 100, 50);
		tf.setBounds(500, 500, 100, 50);
		f.add(tf);
		f.setVisible(true);
		System.out.println("�Է��Ͻ� ����" + tf.getText());
		
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		f.addWindowListener(wa);*/
	}
}
