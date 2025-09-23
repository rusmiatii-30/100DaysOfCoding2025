
package Minggu2;
import java.util.Scanner;
public class Day016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        double Angka1= input.nextDouble();
        
        System.out.print("Masukkan bilangan : ");
        double Angka2 = input.nextDouble();
        
        double Jumlah1 =  Angka1 * Angka2;
        double Jumlah2 = Angka1 / Angka2;
        
        System.out.println("Hasil Perkalian : " + Jumlah1);
        System.out.println("Hasil Pembagian : " + Jumlah2);
    }
}
