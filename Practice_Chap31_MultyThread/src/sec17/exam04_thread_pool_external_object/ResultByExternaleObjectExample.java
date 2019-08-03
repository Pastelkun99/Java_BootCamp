package sec17.exam04_thread_pool_external_object;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByExternaleObjectExample {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[�۾�ó�� ��û]");
		
		// ���� Ŭ����
		class Task implements Runnable {
			// �ܺ� ��ü�� ������ ��� ���� ����
			Result result;
			// ������
			public Task(Result result) {
				this.result = result;
			}
			@Override
			public void run() {
				int sum = 0;
				for(int i = 0; i<=10; i++)
					sum += i;
				
				// �����忡 ���ؼ� ���Ǿ��� ���� �ܺΰ�ü�� result��
				// addValue()�� ȣ���Ͽ� accumValue�� �����ȴ�.
				result.addValue(sum);
				System.out.println("���� ���� ������ �̸� : " + Thread.currentThread().getName()
									+ "\n�۾��� ��� : " + result.getValue());
				// System.out.println(Thread.currentThread().getName());
			}
		}
		Result result = new Result();		// ������ü�� ����
		// �۾� ��ü ����
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		// �۾� ��û(ť�� ����)
		Future<Result> future1 = executorService.submit(task1, result);
		// �Ʒ��� get()�޼��带 �ϳ��� ó�������� ������ �ùٸ� ����� ������ �ƴ��Ѵ�.
		// ��, �������� ó���뺸(���ŷ)�� �޾ƾ� ��μ� ������ ����� ���� �� �ִ�.
		try {
			result = future1.get();
		} catch (InterruptedException e) { e.printStackTrace();}
		catch (ExecutionException e) { e.printStackTrace();}
		
		Future<Result> future2 = executorService.submit(task2, result);
		try {
			result = future2.get(); 		//task2�� ���� ���
			System.out.println("[�۾�ó�� ��� : " + result.accumValue + "]");
			System.out.println("[�۾�ó�� �Ϸ�]");
		} catch (Exception e) { e.getMessage(); }
		
		System.out.println("���� ���� ������ �̸� : " + Thread.currentThread().getName() + 
							"\n�۾��� ��� : " + result.getValue());
		
		executorService.shutdown(); 	//������ Ǯ ����
	}
}
