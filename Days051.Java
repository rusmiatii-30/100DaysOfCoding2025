
package Minggu4;

import java.util.Scanner;

public class Days051 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan batas angka : ");
        int Angka = input.nextInt();
        
        System.out.println("cetak dari 1 sampai " + Angka + " : ");
        for (int i = 1; i <=Angka; i++){
            if( i % 2 == 0){
                System.out.println(i + " adalah genap");
            }
            else{
                System.out.println(i + " adalah ganjil");
            }
        
        }
    }
    
}
