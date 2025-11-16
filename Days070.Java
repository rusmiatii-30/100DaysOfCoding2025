
package Minggu6;

import java.util.Scanner;

public class Days070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang : ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar : ");
        int lebar = input.nextInt();

        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {

               
                if (i == 1 || i == lebar || j == 1 || j == panjang) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
       
        }
        
    }
}
