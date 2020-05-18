package CH05;

import javax.swing.*;

public class R7B24c {
    public static int LIS(int nilai[], int x) {
        int LIS[] = new int[x];
        int indeks, indeks2, maksimal = 0;
        for (indeks = 0; indeks < x; indeks++)
            LIS[indeks] = 1;
        for (indeks = 1; indeks < x; indeks++)
            for (indeks2 = 0; indeks2 < indeks; indeks2++)
                if (nilai[indeks] > nilai[indeks2] && LIS[indeks] < LIS[indeks2] + 1)
                    LIS[indeks] = LIS[indeks2] + 1;
        for (indeks = 0; indeks < x; indeks++)
            if (maksimal < LIS[indeks])
                maksimal = LIS[indeks];
        return maksimal;
    }

    public static void main(String[] args) {
        int nilai[] = {10, 22, 9, 33, 21, 50, 41, 60};
        for (int n = 0; n < nilai.length; n++) {
            System.out.print(nilai[n] + " ");
        }
        int n = nilai.length;
        System.out.println();
        System.out.print("Longest Increasing Subsequence adalah = " + LIS(nilai, n));
    }
}
