import java.util.Scanner;

public class ThreadVol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

     vowel thread = new vowel(inputString);
        thread.start();
    }
}

class vowel extends Thread {
    private String inputString;
    private boolean isVowel(char c) {
        char vowel = Character.toLowerCase(c);
        return vowel == 'a' ||  vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u';
    }

    public vowel(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public void run() {
        for (char c : inputString.toCharArray()) {
            if (isVowel(c)) {
                System.out.println("Vowel: " + c);
                try {
                    Thread.sleep(3000); // Pause for 3 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}