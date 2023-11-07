import java.util.Scanner;
/**
 * Square09_2
 */
public class Square09_2 {
    public static void main(String[] args) {
     
    Scanner sc09 = new Scanner(System.in);
    System.out.print("Masukkan Nilai N = ");
    int N = sc09.nextInt();

    for (int iOuter = 1; iOuter <= N; iOuter++){
        for (int i = 0; i <= N; i++){ // int i = 1 diganti menjadi int i = 0
        System.out.print("*");
        }
        System.out.println();
        }
    }
}