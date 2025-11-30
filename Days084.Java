//Soal1
package Evaluasi6;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int angka = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " " + angka + " = " + (i * angka));
            
        }
    }
    
}

//Soal2


package Evaluasi6;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan n: ");
        int n = s.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("iccang");
            
        }
    }
    
}


//Soal3


package Evaluasi6;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan teks: ");
        String teks = s.nextLine();
        System.out.println("Masukkan jumlah pengulangan (N): ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(teks);
            
        }
    }
    
}

