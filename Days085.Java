
package Minggu7;

public class Days085 {
    public static void main(String[] args) {
        
        int[] a = {16, 6, 66, 61, 166, 11};

        int R = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > R) {
                R = a[i];
            }
        }

        System.out.println("angka maksimal dalam array = " + R);
        
    }
    
}
