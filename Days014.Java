
package Minggu2;
import java.util.Scanner;
public class Day014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai : ");
        String input = scanner.nextLine();
        
        int angka = Integer.parseInt(input);
        System.out.println("Hasil konversi ke int :" + angka);
        
        int angka4 = angka*60;
        System.out.println(angka4);
        
        System.out.print("Masukkan nilai : ");
        String input2 = scanner.nextLine();
        
        double angka5 = Double.parseDouble(input);
        System.out.println("Hasil konversi ke double : ");
        
        double angka7 = angka5/3;
        System.out.println(angka7);
        
    }
    
}
