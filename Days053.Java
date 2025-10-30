
package Minggu4;

import java.util.Scanner;

public class Days053 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
       for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan angka (berhenti kalau 9): ");
            int angka = ip.nextInt();
            if (angka == 9) {
                System.out.println("Angka 9 ditemukan, keluar dari perulangan!");
                break; 
            }
            System.out.println("Angka : " + angka);
        }
        System.out.println("selesai.");
    }
}
