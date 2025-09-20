
//Soal Pertama
package evaluasi;
public class evaluasiday1 {
    public static void main(String[] args) {
        String Nama = "Budi";
        byte Umur = 21;
        double Berat = 65.4;
        float Tinggi = 170.5f;
        int Absen = 12;
        short SKS = 144;
        String NIM = "D0223033";
        char Gender = 'L';
        boolean Aktif = true;
        
       System.out.println("Nama \t = " + Nama);
       System.out.println("Umur \t = " + Umur);
       System.out.println("Berat \t = " + Berat);
       System.out.println("Tinggi \t = " + Tinggi);
       System.out.println("Absen \t = " + Absen);
       System.out.println("SKS \t = " + SKS);
       System.out.println("NIM \t = " + NIM);
       System.out.println("Gender \t = " + Gender);
       System.out.println("Aktif \t = " + Aktif);
        
       System.out.print("Nama \t = " + Nama);
       System.out.print("Umur \t = " + Umur);
       System.out.print("Berat \t = " + Berat);
       System.out.print("Tinggi \t = " + Tinggi);
       System.out.print("Absen \t = " + Absen);
       System.out.print("SKS \t = " + SKS);
       System.out.print("NIM \t = " + NIM);
       System.out.print("Gender \t = " + Gender);
       System.out.print("Aktif \t = " + Aktif);
        
       System.out.printf("Nama\t\t: %s, \nUmur\t\t: %d", Nama,Umur);
       System.out.printf("\nBerat\t\t: %f, \nTinggi\t\t: %f", Berat,Tinggi);
       System.out.printf("\nAbsen\t\t: %d, \nSKS\t\t: %d", Absen,SKS);
       System.out.printf("\nNIM\t\t: %s, \nGender\t\t: %c", NIM,Gender);
       System.out.printf("\nAktif\t\t: %b", Aktif);
         
    }
}


//Soal Kedua
package evaluasi;
public class evaluasi2 {
    public static void main(String[] args) {
        
       //Deklarasi
        String Nama = "Budi";
        byte Umur = 21;
        double Berat = 65.4;
        float Tinggi = 170.5f;
        int Absen = 12;
        short SKS = 144;
        String NIM = "D0223033";
        char Gender = 'L';
        boolean Aktif = true;
       
        System.out.println("Nama = " + Nama);
        System.out.println("Umur = " + Umur);
        System.out.println("Berat = " + Berat);
        System.out.println("Tinggi = " + Tinggi);
        System.out.println("Absen = " + Absen);
        System.out.println("SKS = " + SKS);
        System.out.println("NIM = " + NIM);
        System.out.println("Gender = " + Gender);
        System.out.println("Aktif = " + Aktif);
        
       //inisialisasi
        Nama = "Budi";
        Umur = 21;
        Berat = 65.4;
        Tinggi = 170.5f;
        Absen = 12;
        SKS = 144;
        NIM = "D0223033";
        Gender = 'L';
        Aktif = true;
        
        System.out.println("Nama = " + Nama);
        System.out.println("Umur = " + Umur);
        System.out.println("Berat = " + Berat);
        System.out.println("Tinggi = " + Tinggi);
        System.out.println("Absen = " + Absen);
        System.out.println("SKS = " + SKS);
        System.out.println("NIM = " + NIM);
        System.out.println("Gender = " + Gender);
        System.out.println("Aktif = " + Aktif);
     
       //update
        Nama = "Rusmi";
        Umur = 19;
        Berat = 55.5;
        Tinggi = 155.5f;
        Absen = 16;
        SKS = 150;
        NIM = "D0225016";
        Gender = 'P';
        Aktif = false;
       
        System.out.println("Nama = " + Nama);
        System.out.println("Umur = " + Umur);
        System.out.println("Berat = " + Berat);
        System.out.println("Tinggi = " + Tinggi);
        System.out.println("Absen = " + Absen);
        System.out.println("SKS = " + SKS);
        System.out.println("NIM = " + NIM);
        System.out.println("Gender = " + Gender);
        System.out.println("Aktif " + Aktif);
       
    }
    
}

//Soal Ketiga
package evaluasi;
import java.util.Scanner;
public class evaluasi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama \t\t :");
        String Nama = input.nextLine();
        
        System.out.print("Masukkan Umur \t\t :");
        byte Umur = input.nextByte();
        
        System.out.print("Masukkan Tinggi Badan \t :");
        float TB = input.nextFloat();
        
        System.out.print("Masukkan Berat Badan \t :");
        double BB = input.nextDouble();
        
        System.out.print("Masukkan Alamat \t :");
        String Alamat = input.next();
       
        System.out.println("\n====BIODATA====");
        System.out.println("Masukkan Nama \t\t :" + Nama);
        System.out.println("Masukkan Umur \t\t : " + Umur);
        System.out.println("Masukkan Tinggi Badan \t : " + TB);
        System.out.println("Masukkan Berat Badan \t : " + BB);
        System.out.println("Masukkan Alamat \t : " + Alamat);
         
    }
    
}


//Soal Keempat
package evaluasi;
import java.util.Scanner;
public class evaluasi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama \t\t :");
        final String Nama = input.nextLine();
        
        System.out.print("Masukkan Tahun Lahir \t :");
        final Short Tahun_Lahir = input.nextShort();
        
        System.out.print("Masukkan Tanggal Lahir \t :");
        final byte Tanggal_Lahir = input.nextByte();
        
        System.out.print("Masukkan Nilai Raport \t :"); 
        final double Nilai_Raport = input.nextDouble();
       
        System.out.print("Masukkan Nilai Ujian \t :");
        final int Nilai_Ujian = input.nextInt();
        
        System.out.println("\n=====NILAI FINAL=====");
        System.out.println("Masukkan Nama \t\t :" + Nama);
        System.out.println("Masukkan Tahun Lahir \t : " + Tahun_Lahir);
        System.out.println("Masukkan Tanggal Lahir \t : " + Tanggal_Lahir);
        System.out.println("Masukkan Nilai Raport \t : " + Nilai_Raport);
        System.out.println("Masukkan Nilai Ujian \t : " + Nilai_Ujian);
       
    }
    
}

