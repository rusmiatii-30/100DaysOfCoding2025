
package Minggu2;
import java.util.Scanner;
public class Day015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        int angka3 = input.nextInt();
        
        System.out.print("Masukkan bilangan : ");
        int angka4 = input.nextInt();
        
        int hasil = angka3 + angka4;
        int jumlah = angka3 - angka4;
        
        System.out.println("Hasil Penjumlahan : " + hasil);
        System.out.println("Hasil Pengurangan : " + jumlah);
        
    }
    
}
