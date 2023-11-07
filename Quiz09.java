import java.util.Scanner;
import java.util.Random; 
/**
 * Quiz09
 */
public class Quiz09 {

    public static void main(String[] args) {
        Random random09 = new Random();
        Scanner input09 = new Scanner(System.in); 

        char menu='y';
           do{
            int number = random09.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("Tebak Angka (1-10): ");
                int answer = input09.nextInt();
                input09.nextLine();
                success = (answer == number);
            }while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/T)?");
            menu = input09.nextLine().charAt(0);
        }while (menu == 'Y' || menu == 'T');
    }
}