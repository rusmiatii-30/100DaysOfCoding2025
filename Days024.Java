
package Minggu2;

import java.util.Scanner;

public class Days024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jari jari lingkaran : ");
        double radius = input.nextDouble();
        
        double luas = Math.PI * radius * radius;
        
        System.out.println("Luas Lingkaran : " + luas);
    }
    
}
