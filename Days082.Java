
package Minggu6;

import java.util.Scanner;

public class Days082 {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();
        int[] angka = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        System.out.println("\n=== Menampilkan Semua Elemen Array ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + i + " : " + angka[i]);
        }

    }
    
}
