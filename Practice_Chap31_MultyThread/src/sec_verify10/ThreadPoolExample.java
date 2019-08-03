package sec_verify10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExample {

	public static ExecutorService createThreadPool() {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		return executorService;
	}
	
	public static void main(String[] args) {
		
		Runnable run = new GugudanThread();
		
		System.out.println("[������ �۾� ��û]");
		
		ExecutorService es = createThreadPool();
		
		Future<?> ft = es.submit(run);
		try {
			ft.get();
			System.out.println("[������ �۾� �Ϸ�]");
		} catch (InterruptedException e) { e.printStackTrace();}
		catch (ExecutionException e) { e.printStackTrace();}
		es.shutdown();
	}
}
