import java.util.Random;

public class ThreadLife {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("Thread-1");
        Thread thread2 = new MyThread("Thread-2");
        Thread thread3 = new MyThread("Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThread extends Thread {
    private final Random random = new Random();

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " created.");

        try {
            int sleepTime = random.nextInt(500); // Random sleep time between 0 and 499 milliseconds
            System.out.println(getName() + " will sleep for " + sleepTime + " milliseconds.");
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " is dead.");
    }
}
