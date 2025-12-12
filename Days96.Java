
package Minggu7;

import java.util.Scanner;

public class Days096 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua   : ");
        int b = input.nextInt();

        System.out.println("Hasil Penjumlahan : " + tambah(a, b));
        System.out.println("Hasil Pengurangan : " + kurang(a, b));
        System.out.println("Hasil Perkalian   : " + kali(a, b));
        System.out.println("Hasil Pembagian   : " + bagi(a, b));
    }


    public static int tambah(int x, int y) {
        return x + y;
    }

    public static int kurang(int x, int y) {
        return x - y;
    }

    public static int kali(int x, int y) {
        return x * y;
    }

    public static int bagi(int x, int y) {
        return x / y;
    }
    
}
