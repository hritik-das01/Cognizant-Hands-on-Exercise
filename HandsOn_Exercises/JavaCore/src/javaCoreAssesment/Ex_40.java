package javaCoreAssesment;

public class Ex_40 {

	public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        Thread vThread = Thread.startVirtualThread(() -> {
            System.out.println("Virtual thread running: " + Thread.currentThread());
        });

        vThread.join();
        long endTime = System.currentTimeMillis();
        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}
