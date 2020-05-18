package ch05;

import java.util.jar.JarOutputStream;

public class R6B22n {
    public static void main(String[] args) {

        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println(" Nilai array adalah = ");

        for (int indeks = 0; indeks < angka.length; indeks++) {
            System.out.print(angka[indeks] + " ");
        }
        System.out.println();
        System.out.println();

        int jumlah = 0;
        for (int indeks = 0; indeks < angka.length; indeks++) {
            for (int array : angka) {
                if (angka[indeks] < angka.length) {
                    jumlah = angka.length - angka[indeks];
                }
            }
            System.out.println("Jumlah angka sebelum " + angka[indeks] + " = " + jumlah);
        }
    }
}
