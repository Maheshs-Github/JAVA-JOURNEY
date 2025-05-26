import java.util.Scanner;

public class ThreadVowels implements Runnable 
{

    
    public void run()
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the String: ");
            String input = sc.nextLine();

            int len = input.length();
            System.out.println("Length: " + len);
            for (int i = 0; i < len; i++) {
                char c = input.charAt(i);
                c=Character.toLowerCase(c);
                if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u' ) {
                    System.out.println(c);
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {
        

        ThreadVowels TV1 = new ThreadVowels();
        Thread T1 = new Thread(TV1);
        T1.start();
    }
}