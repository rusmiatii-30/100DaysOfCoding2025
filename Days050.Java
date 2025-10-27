
package Minggu4;

import java.util.Scanner;

public class Days050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        int Angka = input.nextInt();
        
        String Hasil = (Angka % 2 == 0) ? "Genap" : "Ganjil";
        
        System.out.println("Angka " + Angka + " Adalah " + Hasil );
    }
    
}
