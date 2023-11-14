import java.util.Scanner;
import java.util.Arrays;

/**
 * InnerPorseni09
 */

public class Porseni09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        System.out.println("Selamat datang di sistem data Atlet Porseni");
        System.out.println( " =========================================");
        String[] cabor1 = {"Badminton", "Tenis Meja", "Basket", "Sepak Bola", "Voly"};
        int[] NamaAtlet = {5, 5, 5, 5, 5};

        String[][] cabor = new String[5][];
        for (int i = 0; i < cabor.length; i++) {
            cabor[i] = new String[NamaAtlet[i]];
        }

        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Cabang Olahraga " + cabor1[i]);
            for (int j = 0; j < cabor[i].length; j++) {
                System.out.print("Nama atlet ke-" + (j + 1) + ": ");
                cabor[i][j] = sc09.nextLine();
            }
            System.out.println();
        }

        // Mengurutkan data atlet secara ascending
        for (int i = 0; i < cabor.length; i++) {
            Arrays.sort(cabor[i]);
        }

        // Menampilkan data atlet secara berurutan
        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Cabang Olahraga " + cabor1[i]);
            for (int j = 0; j < cabor[i].length; j++) {
                System.out.println(cabor[i][j]);
            }
            System.out.println();
        }

        sc09.close();
    }
}