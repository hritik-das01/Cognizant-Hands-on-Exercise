package javaCoreAssesment;

import java.util.concurrent.*;

public class Ex_41 {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task = () -> {
            TimeUnit.SECONDS.sleep(1);
            return "Task completed by " + Thread.currentThread().getName();
        };

        Future<String> future = executor.submit(task);
        System.out.println("Result: " + future.get());

        executor.shutdown();
    }
}

