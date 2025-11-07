package Minggu5;

public class Days061 {
    public static void main(String[] args) {
        
        int M = 5;
        int N = 60;
        
        System.out.println("Kelipatan " + M + " dari 1 sampai " + N + " adalah:");
        
        for (int i = 0; i < N; i++) {
            if(i % M == 0){
                System.out.print(i + " ");
                
            }
            
        }
    }
    
}
