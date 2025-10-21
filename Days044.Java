package Minggu4;

import java.util.Scanner;

public class Days044 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Ujian : ");
        int nilai = input.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Nilai A");
        } else if (nilai >= 70 && nilai <= 84) {
            System.out.println("Nilai B");
        } else if (nilai >= 55 && nilai <= 69) {
            System.out.println("Nilai C");
        } else if (nilai >= 40 && nilai <= 54) {
            System.out.println("Nilai D");
        } else if (nilai >= 0 && nilai < 40) {
            System.out.println("Nilai E");
        } else {
            System.out.println("Tidak Valid");
        }
    }

}
