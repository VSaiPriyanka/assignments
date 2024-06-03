public class threads {
    public static void main(String[] args) {
        // Create and start the first thread
        Thread thread1 = new Thread(() -> printNumbers(1));
        thread1.start();
        
        // Create and start the second thread
        Thread thread2 = new Thread(() -> printNumbers(2));
        thread2.start();
    }
    
    public static void printNumbers(int threadId) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + threadId + ": " + i);
            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}