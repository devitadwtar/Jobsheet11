import java.util.Scanner;
/**
 * Square09_1
 */
public class Square09_1 {
    public static void main(String[] args) {
     
    Scanner sc09 = new Scanner(System.in);
    System.out.print("Masukkan Nilai N = ");
    int N = sc09.nextInt();

    for (int iOuter = 0; iOuter <= N; iOuter++){ // iOuter = 1 diganti menjadi iOuter = 0
        for (int i = 1; i <= N; i++){
        System.out.print("*");
        }
        System.out.println();
        }
    }
}