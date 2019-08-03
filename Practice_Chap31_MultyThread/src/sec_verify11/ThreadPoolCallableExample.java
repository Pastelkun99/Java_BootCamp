package sec_verify11;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolCallableExample {

	static ExecutorService createPool() {
		ExecutorService exser = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		return exser;
	}
	
	public static void main(String[] args) {
		
		ExecutorService exser = createPool();
		
		SumThread sumt = new SumThread();
		
		Future<Integer> ft1 = exser.submit(sumt);
		try {
			int result = ft1.get();
			System.out.println("[작업처리 결과] : " + result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		exser.shutdown();
	}
}
