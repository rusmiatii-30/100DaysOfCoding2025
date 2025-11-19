package Minggu6;

import java.util.Scanner;

public class Days073 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 0;
        System.out.println("Masukkan angka (Ketika memasukkan angka negatif akan berhenti)");

        while (true) {
            System.out.print("Masukkan angka : ");
            int angka = input.nextInt();

            if (angka < 0) {
                break;
            }

            jumlah += angka;
        }

        System.out.println("Total penjumlahan: " + jumlah);

    }

}
