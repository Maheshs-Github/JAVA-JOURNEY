public class ThreadWork {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread: " + mainThread.getName());

        Thread workerThread1 = new WorkerThread("Worker Thread 1");
        Thread workerThread2 = new WorkerThread("Worker Thread 2");

        workerThread1.start();
        workerThread2.start();
    }
}

class WorkerThread extends Thread {
    public WorkerThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());

        try {
            // Simulate some work
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread finished: " + Thread.currentThread().getName());
    }
}