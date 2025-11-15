// SOAL 1
package Evaluasi5;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       
        System.out.print("Jumlah Karung : ");
        int Jumlah = in.nextInt();
        
        System.out.print("Berat Per Karung : ");
        int Perkarung = in.nextInt();
        
        int hasil = Jumlah*Perkarung;
        System.out.println("Total berat : " + hasil);
        
    }
    
}

//SOAL2

package Evaluasi5;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Suhu Ruangan : ");
        int suhu = in.nextInt();
        
        if(suhu < 20){
            System.out.println("Dingin");
        }
        else if(suhu > 30){
            System.out.println("Panas");
        }
        else{
            System.out.println("Normal");
        }
    }
}

//SOAL3
package Evaluasi5;
import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int Angka = in.nextInt();
        if(Angka % 2 == 0){
            System.out.println("Gerbang Terbuka (Genap)");
        }
        else{
            System.out.println("Gerbang tetap tertutup (Ganjil)"); 
        }   
    } 
}

//SOAL4
package Evaluasi5;
import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan Angka : ");
        int Angka = in.nextInt();
        
        if(Angka > 0){
            System.out.println("Positif");
        }
        else if(Angka < 0){
            System.out.println("Negatif");
        }
        else{
            System.out.println("Nol");
        }
    }  
}

//SOAL 5
package Evaluasi5;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah Petak : ");
        int petak = in.nextInt();
        int total = 0;
        for (int i = 1; i <= petak; i++) {
            System.out.print("Luas Petak Ke- " + i +":");
            int petak1 = in.nextInt();
            total += petak1;
        }
            System.out.println("Total Luas Sawah : " + total);
    }
    
}

