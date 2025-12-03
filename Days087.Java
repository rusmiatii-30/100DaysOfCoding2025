
package Minggu7;

import java.util.Scanner;

public class Days087 {
    public static void main(String[] args) {
        
        
      Scanner input = new Scanner(System.in);
       int[] a = {1, 3, 5, 7, 9};
        System.out.print("Cari angka : ");
        int R = input.nextInt();
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == R) {
                index = i;
                break;
            }
        }

        System.out.println(index == -1 ? "Angka Tidak Ditemukan" : "Ketemu di index " + index);
    }
}
