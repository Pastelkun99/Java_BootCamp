package sec17.exam03_thread_pool_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		// �ش� PC CPU�� �ھ���� �ִ� ������ ���� �ش�. (ex. ����ھ�� 2, �����ھ�� 4�̴�)
		ExecutorService executorservice = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("������ ���� : " + Runtime.getRuntime().availableProcessors());
		
		// Callable�͸� ������ü ���� ( �۾���ü) -->
		// ���� ���� <T>Ÿ������ �����Ѵ�. �Ͽ�, ���ϰ��� <T>Ÿ�԰� �����ؾ� �Ѵ�.
		System.out.println("[�۾�ó����û]");
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i = 0; i<=10; i++)
					sum += i;
				
				return sum;
			}
		};
		// �۾� ť�� �۾��� �ִ´�.
		// ���� ���� <T>, �Ͽ� Future<T> submit(Callable Task)�� �����Ѵ�.
		// �۾��� �Ϸ�ɶ����� ���ŷ, �� ��ٸ���. Future�� �����Ϸᰴü�̴�.
		// Future���� <T>Ÿ������ �����ؾ� �Ѵ�.
		Future<Integer> future = executorservice.submit(callable);
		try {
			System.out.println("���ŷ ���� " + System.currentTimeMillis());
			int value = future.get(); 	//get()�� �۾���ü�� �۾��� �Ϸ��� ������ ��ٸ���.(���ŷ)
			System.out.println("���ŷ �� " + System.currentTimeMillis());
			System.out.println("[�۾�ó�� ���] : " + value);
			System.out.println("[�۾�ó�� �Ϸ�]");
		} catch (Exception e) { e.printStackTrace();}
		executorservice.shutdown();
	}
}
