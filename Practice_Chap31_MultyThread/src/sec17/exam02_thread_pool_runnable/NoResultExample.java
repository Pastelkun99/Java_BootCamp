package sec17.exam02_thread_pool_runnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		
		// �ش� PC CPU�� �ھ���� �ִ� ������ ���� �ش�. (ex. ����ھ�� 2, �����ھ�� 4�̴�.)
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		// Runnable �͸� ������ü ����( �۾���ü) --> ���� ���� ����.
		System.out.println("[�۾�ó����û]");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i = 1; i<=10; i++)
					sum += i;
				
				System.out.println("[�۾�ó�����] : " + sum);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		// �۾� ť�� �۾��� �ִ´�. ���ϰ��� ����. �Ͽ� Future<?> submit(Runnable Task)�� �����Ѵ�.
		// �۾��� �Ϸ�ɶ����� ����ŷ, �� ��ٸ���. Future�� �����Ϸᰴü�̴�.
		Future<?> future = executorService.submit(runnable);
		try {
			Object obj = future.get(); 		//get()�� �۾���ü�� �۾��� �Ϸ��� �� ���� ��ٸ���.(����ŷ)
			String str = (String)obj;
			System.out.println("[�۾�ó���Ϸ�]");
			System.out.println("Future�� get()�� ������ �� : " + str);
		} catch (InterruptedException e) { e.printStackTrace();	}
		catch (ExecutionException e) { e.printStackTrace(); }
		executorService.shutdown(); //������Ǯ����
	}
}