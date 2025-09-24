
package Minggu2;
import java.util.Scanner;
public class Day017 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int Nilai = Input.nextInt();
        
        System.out.print("Masukkan angka : ");
        int Nilai2 = Input.nextInt();
        
        int HasilBagi = Nilai / Nilai2;
        int HasilModulus = Nilai % Nilai2;
        
        System.out.println("Hasil Bagi : " + HasilBagi);
        System.out.println("Hasil Modulus : " + HasilModulus);
        
    }
}
