import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ThreadPC {
    private static Queue<Integer> buffer = new LinkedList<>();
    private static int maxSize = 10;
    private static Object lock = new Object();
    private static Random random = new Random();

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (buffer.size() == maxSize) {
                        try {
                            System.out.println("Buffer is full, producer is waiting...");
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    int value = random.nextInt(100);
                    buffer.offer(value);
                    System.out.println("Produced value: " + value);
                    lock.notify();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (buffer.isEmpty()) {
                        try {
                            System.out.println("Buffer is empty, consumer is waiting...");
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    int value = buffer.poll();
                    System.out.println("Consumed value: " + value);
                    lock.notify();
                }
            }
        }
    }
}