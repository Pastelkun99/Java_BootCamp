package sec08_exam_thread_state;

// stateprintthread�� targetthread�� ���¸� �˱� ���� �������̴�.
public class StatePrintThread extends Thread {

	// ������ ���¸� �˾ƺ��� ���� ����� targetthread�� �����Ͽ���.
	private TargetThread targetThread;
	
	//������
	public StatePrintThread(TargetThread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		
		while(true) {
			//Targetthread�� ���������� ��´�.
			// Thread.state�� ThreadŬ������ ����Ŭ�����̸�, EnumŸ���̴�.
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� : " + state);
			//targetthread�� �����Ǿ���? �Ǿ����� run() ����
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			//�����尡 ����Ǿ���?
			if(state == Thread.State.TERMINATED) {
				break;
				//����Ǿ��ٸ� ���� Ż��
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
