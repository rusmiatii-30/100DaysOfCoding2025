package Minggu5;

import java.util.Scanner;

public class Days068 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan ukurang persegi : ");
        int persegi = input.nextInt();
        
        for (int i = 1; i <= persegi; i++) {
            for (int j = 1; j <= persegi; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
