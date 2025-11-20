
package Minggu6;

import java.util.Scanner;

public class Days074 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Pedanda");
            System.out.println("2. Alamat");
            System.out.println("3. Pasangkayu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Pedanda");
                    break;

                case 2:
                    System.out.println("Anda memilih Alamat");
                    break;

                case 3:
                    System.out.println("Anda memilih Pasangkayu");
                    break;

                case 4:
                    System.out.println("Terima kasih! Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Coba lagi.");
            }

        } while (pilihan != 4);



   
    }
    
    
}
