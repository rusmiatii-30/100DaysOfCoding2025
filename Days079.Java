
package Minggu6;

import java.util.Scanner;

public class Days079 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.println("=== BUAT ===");
        System.out.print("Masukkan Username: ");
        String user = input.nextLine();
        System.out.print("Masukkan Password: ");
        int sandi = input.nextInt();
        input.nextLine();

        while (true) {
            System.out.println("=== Login ===");

            System.out.print("Username: ");
            String nama = input.nextLine();

            System.out.print("Password: ");
            int pass = input.nextInt();
            input.nextLine();

            if (nama.equalsIgnoreCase(user) && pass == sandi) {
                System.out.println("\nANDA BERHASIL LOGIN!!");
                break;
            } else {
                System.out.println("Username atau password salah! Coba lagi.\n");
            }
        }
    }
    
}
