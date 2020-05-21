package ch08;

public class LongestCommonSubstringProblem {
    public static int getLongestCommonSubstring(String ANGKA, String BILANGAN) {
        int x = ANGKA.length();
        int y = BILANGAN.length();
        int max = 0;
        int[][] angka = new int[x][y];

        for (int indeks = 0; indeks < x; indeks++) {
            for (int indeks2 = 0; indeks2 < y; indeks2++) {
                if (ANGKA.charAt(indeks) == BILANGAN.charAt(indeks2)) {
                    if (indeks == 0 || indeks2 == 0) {
                        angka[indeks][indeks2] = 1;
                    } else {
                        angka[indeks][indeks2] = angka[indeks - 1][indeks2 - 1] + 1;
                    }
                    if (max < angka[indeks][indeks2])
                        max = angka[indeks][indeks2];
                }
            }
        }
            return max;
    }
}