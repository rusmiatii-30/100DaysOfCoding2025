
package Minggu3;

import java.util.Scanner;

public class Days038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt(); 

        if (angka > 0) {
        System.out.println(angka + " adalah bilangan positif.");
        }
        else if (angka < 0) {
        System.out.println(angka + " adalah bilangan negatif.");
        }
        else {
        System.out.println("ini adalah angka nol");
        }
    }
}
