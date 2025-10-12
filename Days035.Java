
package Minggu3;

import java.util.Scanner;

public class Days035 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        int Angka = input.nextInt();
        
        if (Angka % 2 == 0){
            System.out.println( Angka + " Adalah Angka genap");
        }
        else{
            System.out.println( Angka + " Adalah Angka ganjil");
        }
    }
}

    

