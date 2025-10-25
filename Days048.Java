
package Minggu4;

import java.util.Scanner;

public class Days048 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        
        int angka1, angka2, hasil;
        char operator;
        System.out.print("Masukkan Angka Pertama : ");
        angka1 = input.nextInt();
        
        System.out.print("Pilih Operator (+,-,*,/) : ");
        operator = input.next().charAt(0);
        
        System.out.print("Masukkan Angka Kedua : ");
        angka2 = input.nextInt();
       
        
        switch (operator){
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println("Hasil " + hasil);
                break;
            default:
                System.out.println("Operator tidak tersedia");
        
    }
        
        
    }
}
