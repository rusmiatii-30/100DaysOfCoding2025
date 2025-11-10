package Minggu5;

public class Days064 {
    public static void main(String[] args) {
        
        int M = 5;
        int N = 3;
        
        int hasil = 1;
        
        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }
        System.out.println(M + " Pangkat " + N + " = " + hasil);
        
    }
    
}
