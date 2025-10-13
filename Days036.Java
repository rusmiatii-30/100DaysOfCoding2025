
package Minggu3;

import java.util.Scanner;

public class Days036 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        int Angka = input.nextInt();
        
        if(Angka > 0){
            System.out.println("Angka Positif");
        }
        else if(Angka < 0 ){
            System.out.println("Angka Negatif");
        }
        else{
            System.out.println("Angka Nol");
        }
       
       
        
    }
}

   

   
