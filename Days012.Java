
package Minggu1;
import java.util.Scanner;
public class Day012 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama \t\t\t: ");
        String Nama = input.nextLine();
        
        System.out.print("Masukkan Tempat Tanggal Lahir\t:");
        String TTL = input.nextLine();
        
        System.out.print("Masukkan Jenis Kelamin\t\t:");
        String Jenis_Kelamin = input.nextLine();
        
        System.out.print("Masukkan Alamat\t\t\t:");
        String Alamat = input.nextLine();
        
        System.out.print("Masukkan Hobi\t\t\t:");
        String Hobi = input.nextLine();
        
        System.out.print("Masukkan No Telpon\t\t:");
        String No_Telpon = input.nextLine();
        
        System.out.print("Masukkan Umur\t\t\t:");
        int Umur = input.nextInt();
        
        System.out.print("Masukkan Tinggi Badan\t\t:");
        float Tinggi_Badan = input.nextFloat();
        
        System.out.print("Masukkan Berat Badan\t\t:");
        double Berat_Badan = input.nextDouble();
        
        
       System.out.println("Masukkan Nama\t\t\t: " + Nama );
       System.out.println("Masukkan Tempat Tanggal Lahir\t:" + TTL);
       System.out.println("Masukkan Jenis Kelamin\t\t: " + Jenis_Kelamin);
       System.out.println("Masukkan Alamat\t\t\t: " + Alamat );
       System.out.println("Masukkan Hobi\t\t\t: " + Hobi);
       System.out.println("Masukkan No Telpon\t\t: "+ No_Telpon);
       System.out.println("Masukkan Umur\t\t\t: "+ Umur);
       System.out.println("Masukkan Tinggi Badan\t\t:" + Tinggi_Badan);
       System.out.println("Masukkan Berat Badan\t\t:" + Berat_Badan);
         
    }
    
}
