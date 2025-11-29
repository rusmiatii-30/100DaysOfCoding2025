
package Minggu6;

public class Days083 {
    public static void main(String[] args) {
       
        
        int[] Angka = {2, 5, 9, 8, 10};
        int hitung = 0;

        for (int i = 0; i < Angka.length; i++) {
            hitung += Angka[i];
        }
        System.out.println("hasil penjumlahan = " + hitung);
    }
    
}
