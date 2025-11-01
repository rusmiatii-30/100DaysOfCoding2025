
// SOAL 1
package Evaluasi4;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Batas Bawah : ");
        int Bawah = input.nextInt();
        System.out.print("Batas Atas : ");
        int Atas = input.nextInt();
        System.out.print("Angka : ");
        int Angka = input.nextInt();
        
        if(Bawah == 1 && Bawah != 1){
            System.out.println("YAYAYAYA");
        }
        else if(Atas == 5 && Atas != 5){
            System.out.println("YAYAYAYA");
        }
        else if(Angka == 3 && Angka != 6){
            System.out.println("YAYAYAYA");
        }
        else{
            System.out.println("NONONONO");
        }
    }
    
}


// SOAL 2

package Evaluasi4;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilai:");
        int Nilai = input.nextInt();
        
        if(Nilai > 70){
            System.out.println("Ujian Kroco Ji Pale");
        }
        else{
            System.out.println("Sa Jappo'ka Aih");
        }
    }
    
}

// SOAL 3

package Evaluasi4;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
        System.out.print("Angka:");
        int Angka = input.nextInt();
        
        if(Angka % 2 == 0){
            System.out.println("Iyaji");
        }
        else{
            System.out.println("Tidakji");
        }
    }
    
}

