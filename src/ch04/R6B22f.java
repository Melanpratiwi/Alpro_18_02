package ch04;

import java.util.Arrays;
public class R6B22f {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println(Arrays.toString(angka));
        System.out.println("Angka Ganjil yang diapit oleh angka genap pada array ini adalah :");

        for (int indeks = 0; indeks < angka.length; indeks++) {
            if (angka[indeks] % 2 == 1){
                System.out.print(angka[indeks] + " ");
            }
        }
    }
}
