
package Minggu4;

import java.util.Scanner;

public class Days045 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n===MENU MAKANAN===");
        System.out.println("1. Mie Ayam");
        System.out.println("2. Nasi Goreng");
        System.out.println("3. Lalapan ");
        System.out.println("4. Nasi Campur");
        System.out.println("Pilih Menu (1-4)");
        int Pilih_Menu = input.nextInt();
        
        switch (Pilih_Menu){
            
            case 1:
                System.out.println("Mie Ayam");
                break;
            case 2:
                System.out.println("Nasi Goreng");
                break;
            case 3:
                System.out.println("Lalapan");
                break;
            case 4:
                System.out.println("Nasi Campur");
                break;
            default:
                System.out.println("Tidak Tersedia");
        
    }
    }
    
}
