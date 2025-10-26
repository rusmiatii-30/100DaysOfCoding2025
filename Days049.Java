
package Minggu4;

import java.util.Scanner;

public class Days049 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur Anda : ");
        int umur = input.nextInt();
        String kategori = (umur >= 18) ? "Dewasa" : "Belum Dewasa";
        System.out.println("Anda termasuk " + kategori);
    }
    
}
