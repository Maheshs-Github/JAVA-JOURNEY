import java.util.Random;

public class TOperation {

    private static int number;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread randomNumberGenerator = new Thread(new RandomNumberGenerator());
        Thread squareCalculator = new Thread(new SquareCalculator());
        Thread cubeCalculator = new Thread(new CubeCalculator());

        randomNumberGenerator.start();
        squareCalculator.start();
        cubeCalculator.start();
    }

    private static class RandomNumberGenerator implements Runnable {
        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                try {
                    Thread.sleep(1000); // Generate a new number every second
                    number = random.nextInt(100); // Generate a random number between 0 and 99
                    System.out.println("Generated number: " + number);
                    synchronized (lock) {
                        lock.notifyAll(); // Notify other threads that a new number is available
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class SquareCalculator implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    try {
                        lock.wait(); // Wait for a new number to be generated
                        if (number % 2 == 0) {
                            int square = number * number;
                            System.out.println("Square of " + number + " is " + square);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static class CubeCalculator implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    try {
                        lock.wait(); // Wait for a new number to be generated
                        if (number % 2 != 0) {
                            int cube = number * number * number;
                            System.out.println("Cube of " + number + " is " + cube);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}