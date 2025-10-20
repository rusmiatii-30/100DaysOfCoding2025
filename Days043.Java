
package Minggu4;

import java.util.Scanner;

public class Days043 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        int Angka = input.nextInt();
        
        if(Angka % 3 == 0 && Angka % 5 == 0){
            System.out.println(Angka + " adalah lipatan 3 dan 5");
        }
        else if(Angka % 3 == 0){
            System.out.println(Angka + " adalah kelipatan 3");
        }
        else if(Angka % 5 == 0){
            System.out.println(Angka + " adalah kelipatan 5");
        }
        else{
            System.out.println("bukan kelipatan 3 dan 5");
        }
    }
}
