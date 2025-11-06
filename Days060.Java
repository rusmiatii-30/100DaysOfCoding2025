package Minggu5;

import java.util.Scanner;

public class Days060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan Angka N : ");
        int N = input.nextInt();
        
        System.out.println("Angka Ganjil N ke 1 : ");
        for (int i = N; i >= 1; i--) {
            if(i % 2 != 0){
                System.out.print(i + " ");
                
            }
            
            
        }
        System.out.println("\nAngka Genap N ke 1 : ");
        for (int i = N; i >= 1; i--) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
            
        }
    }
}
