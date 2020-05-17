package ch04;

import java.util.Scanner;
public class R6B22b {
    public static void main(String[] args) {
        int[]angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Angka yang ingin ditemukan :");
        int Angka = sc.nextInt();

        for (int indeks =0 ; indeks < angka.length; indeks++) {
            if (angka[indeks] == Angka) {
                System.out.println("Angka ditemukan");
                System.out.println("Angka terletak pada indeks :" + indeks);
                return;
            }
        }
        System.out.println("Angka tidak ditemukan pada indeks manapun");
    }
}