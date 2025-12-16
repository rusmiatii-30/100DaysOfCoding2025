package Minggu7;

import java.util.Scanner;

public class Days100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        int idxI = -1;
        int idxS = -1;
        int idxC = -1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                idxI = i;
                break;
            }
        }
        if (idxI != -1) {
            for (int i = idxI + 1; i < S.length(); i++) {
            if (S.charAt(i) == 'S') {
            idxS = i;
            break;
            }
            }
        }
        if (idxS != -1) {
            for (int i = idxS + 1; i < S.length(); i++) {
            if (S.charAt(i) == 'C') {
            idxC = i;
            break;
        }
        }
        }

        if (idxI != -1 && idxS != -1 && idxC != -1) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}
