package Minggu3;
public class Days034 {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        boolean aktif = true;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >= b : " + (a >= b));

        System.out.println("(a < b) && (b > 5)  : " + ((a < b) && (b > 5)));
        System.out.println("(a > b) || (b > 5)  : " + ((a > b) || (b > 5)));
        System.out.println("!aktif              : " + (!aktif));

        boolean hasil = (a < b) && (b > 5) && aktif;
        System.out.println("Apakah semua syarat terpenuhi? : " + hasil);
    }

}

