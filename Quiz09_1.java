import java.util.Scanner;
import java.util.Random; 
public class Quiz09_1 {

    public static void main(String[] args) {
        Random random09 = new Random();
        Scanner input09 = new Scanner(System.in); 

        char menu = 'y';
        int number = new Random().nextInt(10) + 1;
        boolean success = false;

        do {
            System.out.print("Tebak angka (1-10): ");
            int answer = new Scanner(System.in).nextInt();

            success = (answer == number); // periksa tebakan benar salahnya

            if (!success) { 
                if (answer < number) {
                    System.out.println("Tebakan Anda terlalu kecil!");
                } else {
                    System.out.println("Tebakan Anda terlalu besar!");
                }
            }

            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)? ");
            menu = new Scanner(System.in).next().charAt(0);
        } while (menu == 'y' || menu == 'Y');

        System.out.println("Terima kasih telah bermain!");
    }
}