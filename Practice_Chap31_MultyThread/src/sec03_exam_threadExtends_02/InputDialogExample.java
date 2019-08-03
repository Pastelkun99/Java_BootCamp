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
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		/*Frame f = new Frame();
		TextField tf = new TextField(10);
		f.setLayout(new FlowLayout());
		f.setBounds(500, 500, 100, 50);
		tf.setBounds(500, 500, 100, 50);
		f.add(tf);
		f.setVisible(true);
		System.out.println("입력하신 값은" + tf.getText());
		
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		f.addWindowListener(wa);*/
	}
}
