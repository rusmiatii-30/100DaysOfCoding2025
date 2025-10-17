
package Minggu3;

import java.util.Scanner;

public class Days040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Pilih operasi (+, -, *, /): ");
        char operasi = input.next().charAt(0);

        if (operasi == '+') {
        System.out.println("Hasil = " + (a + b));
        }
        if (operasi == '-') {
        System.out.println("Hasil = " + (a - b));
        }
        if (operasi == '*') {
        System.out.println("Hasil = " + (a * b));
        }
        if (operasi == '/') {
        System.out.println("Hasil = " + (a / b));
        }
    }
}
