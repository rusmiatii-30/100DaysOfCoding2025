
package Minggu7;

public class Days098 {
    
    public static void main(String[] args) {
        
        int N = 10; 
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int c = a + b; c <= N; c = a + b) {
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        
    }
    
}
