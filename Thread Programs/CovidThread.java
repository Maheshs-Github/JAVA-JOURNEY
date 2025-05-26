public class CovidThread {
    public static void main(String[] args) {
        Thread thread1 = new PrinterThread("COVID19", 10);
        Thread thread2 = new PrinterThread("LOCKDOWN2020", 20);
        Thread thread3 = new PrinterThread("VACCINATED2021", 30);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PrinterThread extends Thread {
    private String text;
    private int count;

    public PrinterThread(String text, int count) {
        this.text = text;
        this.count = count;
    }

    @Override
    public void run() {
        try
        {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
            Thread.sleep(2000);
        }
    }catch(InterruptedException i)
    {
        i.printStackTrace();
    }
    }
}