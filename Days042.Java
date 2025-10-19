
package Minggu4;

import java.util.Scanner;

public class Days042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Gaji Pokok : ");
        int Gajipokok = input.nextInt();
        System.out.println("Masukkan Potongan : ");
        int Gajipotongan = input.nextInt();
        
        int totalgaji = Gajipokok -Gajipotongan;
        
        if(totalgaji > 0){
            System.out.println("Gaji Bersih " + totalgaji);
        }
        else{
            System.out.println("potongan tidak boleh melebihi gaji");
            
        }
        
        
       
    }
    
}
