
package Minggu2;
public class Days021 {
    public static void main(String[] args) {
        int rusmi1 = 30;
        int dina2 = 40;
        
        System.out.println("belum ditukar");
        System.out.println("nilai rusmi1 = " + rusmi1);
        System.out.println("nilai dina2 = " + dina2);
        
        rusmi1 = rusmi1 + dina2;
        dina2 = rusmi1 - dina2;
        rusmi1 = rusmi1 - dina2;
        
        System.out.println("sudah ditukar");
        System.out.println("nilai rusmi1 = " + rusmi1);
        System.out.println("nilai dina2 = " + dina2);
    }
}
