
//SOAL KESATU
package Evaluasi3;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama : ");
        String Nama = input.nextLine();
        
        System.out.print("Masukkan Angka dalam bentuk String : ");
        String Angka = input.nextLine();
        
        int d = Integer.parseInt(Angka);
        d ++;
        d --;
        d += 7;
        d -= 4;

        String r = String.valueOf(d);
        
        System.out.println("Nama : " + Nama );
        System.out.println("Nilai akhir (int) : " + d );
        System.out.println("Nilai akhir (int) : " + r );
        System.out.println("");
        
    }
    
}


//SOAL KEDUA
package Evaluasi3;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===Pilih Bangun Datar===");
        System.out.println("1. Persegi : ");
        System.out.println("2. Persegi Panjang : ");
        System.out.println("3. Lingkaran : ");
        
        System.out.println("Masukkan Pilihan : ");
        int Pilihan = input.nextInt();
        
        if(Pilihan == 1 ){
            System.out.println("Masukkan sisi : ");
            int sisi = input.nextInt();
            int luas = sisi * sisi;
            System.out.println("Persegi : " + luas );
        }
        else if(Pilihan == 2 ){
            System.out.println("Masukkan Nilai Panjang ");
            int Panjang = input.nextInt();
            int Lebar = input.nextInt();
            int luas = Panjang * Lebar ;
            System.out.println("Persegi Panjang : " + luas );
        }
        else if (Pilihan == 3 ){
            System.out.println("Masukkan Nilai Lingkaran : ");
            int luas = input.nextInt();
            int sisi = input.nextInt();
            double Luas = 3.14 * (sisi * sisi)   ;
            System.out.println("Luas Persegi Panjang : " + Luas );  
        }
    }
    
}



//SOAL KETIGA
package Evaluasi3;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Siswa : ");
        String Nama = input.nextLine();
        System.out.print("Masukkan Nilai Siswa : ");
        int Nilai = input.nextInt();
         
        if(Nilai >= 90){
            System.out.println("Sangat Baik");
        }
        else if (Nilai >= 75){
            System.out.println("Baik");
        }
        else if (Nilai >= 60){
            System.out.println("Cukup");
        }
        else{
            System.out.print("siswa : " + Nama + " Tidak Lulus ");
        }
        if(Nilai % 2 == 0){
            System.out.println("\nNilai Genap ");
        }
        else{
            System.out.println("\nNilai Ganjil ");
        }
    }
    
}




//SOAL KEEMPAT
package Evaluasi3;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Kasir : ");
        String Nama = input.nextLine();
        
        System.out.print("Masukkan Harga Barang : ");
        
        double Harga = input.nextInt();
        
        double Totaldiskon = 0;
        double Hargaakhir = 0;
        if (Harga >= 1000000){
            Totaldiskon = (Harga * 20 ) / 100; 
            Hargaakhir = Harga - Totaldiskon;
            System.out.println("Pelanggan Mendapat Diskon ");
        }
        else if (Harga >= 500000 || Harga <= 1000000){
            Totaldiskon = (Harga * 10 ) / 100;
            Hargaakhir = Harga - Totaldiskon;
            System.out.println("Pelanggan Mendapat Diskon ");
        }
        else{
            System.out.println("Tidak Dapat Diskon");
        
        }
        
        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Kasir          : " + Nama );
        System.out.println("Harga Barang   : " + "Rp " + Harga );
        System.out.println("Diskon (10.0%) : " + "Rp " + Totaldiskon );
        System.out.println("Total Bayar    : " + "Rp " + Hargaakhir);
        
    }
    
}




//SOAL KELIMA
package Evaluasi3;

import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.println("===MENU===");
        System.out.println("1. Penjumlahan" );
        System.out.println("2. Pengurangan" );
        System.out.println("3. Perkalian" );
        System.out.println("4. Pembagian" );
        
        System.out.println("Masukkan Angka : ");
        int Angka1 = input.nextInt();
        System.out.println("Masukkan Angka : ");
        int Angka2 = input.nextInt();
        System.out.println("Masukkan Pilih : ");
        char Pilihan = input.next().charAt(0);
       
        if(Pilihan ==  '1'){
            System.out.println(Angka1 + Angka2);
        }
        if (Pilihan == '2'){
            System.out.println(Angka1 - Angka2);
        }
        if (Pilihan == '3'){
            System.out.println(Angka1 * Angka2);
        }
        if (Pilihan == '4'){
            System.out.println(Angka1 / Angka2); 
        }  
    }
    
}

