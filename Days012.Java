
package Minggu1;
import java.util.Scanner;
public class Day012 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Nama Lengkap\t\t: ");
        String Nama = input.nextLine();
        
        System.out.print("Tempat Tanggal Lahir\t:");
        String TTL = input.nextLine();
        
        System.out.print("Jenis Kelamin\t\t:");
        String Jenis_Kelamin = input.nextLine();
        
        System.out.print("Alamat\t\t\t:");
        String Alamat = input.nextLine();
        
        System.out.print("Hobi\t\t\t:");
        String Hobi = input.nextLine();
        
        System.out.print("No Telpon\t\t:");
        String No_Telpon = input.nextLine();
        
        System.out.print("Umur\t\t\t:");
        int Umur = input.nextInt();
        
        System.out.print("Tinggi Badan\t\t:");
        float Tinggi_Badan = input.nextFloat();
        
        System.out.print("Berat Badan\t\t:");
        double Berat_Badan = input.nextDouble();
            
    }
    
}
