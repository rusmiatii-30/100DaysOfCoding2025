
package Minggu5;

import java.util.Scanner;

public class Days059 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan Angka N : ");
        int N = input.nextInt();
        
        System.out.println("Angka Ganjil 1 Sampai N : ");
        for (int i = 1; i <= N; i++) {
            if(i % 2 != 0){
                System.out.print(i + "");
                
            }
            
            
        }
        System.out.println("\nAngka Genap 1 Sampai N : ");
        for (int i = 1; i <= N; i++) {
            if(i % 2 == 0){
                System.out.print(i + "");
            }
            
        }
    }
    
}
