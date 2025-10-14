
package Minggu3;

import java.util.Scanner;

public class Days037 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.println("Masukkan Angka : ");
        int Angka = input.nextInt();

        if (Angka % 2 == 0) {
        System.out.println(Angka + " adalah bilangan genap.");
        }
        else  {
        System.out.println(Angka + " adalah bilangan ganjil.");
    }
    }
}
