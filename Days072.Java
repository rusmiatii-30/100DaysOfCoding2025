
package Minggu6;

import java.util.Scanner;

public class Days072 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi : ");
        int n = input.nextInt();

       
        System.out.println("\nPola Rata Kanan:");
        for (int i = n; i >= 1; i--) {
            for (int k = 0; k < n - i; k++) 
            System.out.print(" ");
            for (int j = 1; j <= i; j++) 
            System.out.print("*");
            System.out.println();
        }
        System.out.println("\nPola Rata Kiri:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) 
            System.out.print("*");
            System.out.println();
        }
        
    }
    
}
