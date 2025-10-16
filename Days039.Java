
package Minggu3;

import java.util.Scanner;

public class Days039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1. Es Teh");
        System.out.println("2. Mie Ayam ");
        System.out.print("Pilih menu (1-2): ");
        int pilih = input.nextInt();

        if (pilih == 1) {
        System.out.println("Anda memilih Es Teh");
        }
        else if(pilih == 2) {
        System.out.println("Anda memilih Mie Ayam");
        }
        else{
            System.out.println("Pilihan Tidak Ada");
        }
    }
}
