
package Minggu7;

import java.util.Scanner;

public class Days093 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan angka : ");
        double a = input.nextDouble();

        double ceil = Math.ceil(a);
        double floor = Math.floor(a);
        long round = Math.round(a);

        System.out.println("angka = " + a);
        System.out.println("ceil  = " + ceil);
        System.out.println("floor = " + floor);
        System.out.println("round = " + round);
    }
    
}
