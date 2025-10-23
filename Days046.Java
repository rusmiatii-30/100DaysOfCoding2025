
package Minggu4;

import java.util.Scanner;

public class Days046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== MENU MINUMAN ===");
        System.out.println("1. Es Teh");
        System.out.println("2. Kopi Hitam");
        System.out.println("3. Jus Jeruk");
        System.out.println("4. Air Mineral");
        System.out.print("Pilih minuman (1-4): ");
        int pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.println("Es Teh - Harga Rp5.000");
                break;
            case 2:
                System.out.println("Kopi Hitam - Harga Rp7.000");
                break;
            case 3:
                System.out.println("Jus Jeruk - Harga Rp15.000");
                break;
            case 4:
                System.out.println("Air Mineral - Harga Rp5.000");
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
              
        }
    }
    
}
