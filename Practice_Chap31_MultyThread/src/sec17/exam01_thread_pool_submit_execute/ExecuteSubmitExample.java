package sec17.exam01_thread_pool_submit_execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitExample {

	public static void main(String[] args) {
		
		//�ִ� 2���� �����带 ������ ������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for(int i = 0; i<20; i++) {
			//20���� �۾���ü ����
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// newFixedThreadPool�� newCachedThreadPool�� ���������� ThreadPoolExecutor��
					// ����� ���� ������ Ÿ�Ժ�ȯ���� ThreadPoolExecutor��ü�� ���� �� �ִ�.
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
					//���� ������Ǯ�� �ִ� ������ ������ �����Ͽ� ���� �� �ִ�.
					int poolsize = threadPoolExecutor.getPoolSize();
					
					// �۾������ϴ� ������ ���� ��´�.
					String threadName = Thread.currentThread().getName();
					//System.out.println("�۾� ó��-" + threadName);
					System.out.println("[�� ������ ���� : " + poolsize + "] �۾������� �̸� : " + threadName);
					
					// �Ϻη� ���ܸ� �߻����Ѽ� execute()�� submit()�� ���̸� ����.
					try {
						int value = Integer.parseInt("��");
					} catch (Exception e) {
						e.toString();
					}
				}
			};
			// �۾�ť�� runnable��ü�� �ִ� ����, execute()�� �۾�ó�����߿� ���ܰ� �߻��ϸ�,
			// �ش� �����带 �����ϰ� ���ο� �����带 �����Ѵ�. submit()�� ���ܰ� �߻��ϴ���,
			// �ش� �����带 �������� �ʰ� ������ �Ѵ�. �Ͽ�, submit()�� ����ϴ� ���� ����.
			// ���� Ȯ���غ���.
			//executorService.execute(runnable);
			executorService.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
		// ������Ǯ�� ���������Ŵ(��, �۾�ť�� �ִ� ��� �۾��� ó���� �Ŀ� ������ Ǯ�� �����Ų��.
		executorService.shutdown();
	}
}
