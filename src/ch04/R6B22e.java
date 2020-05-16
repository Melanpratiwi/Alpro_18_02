package ch04;

public class R6B22e {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Angka yang memiliki angka 2 dari array ini adalah :");
        for (int indeks = 0; indeks < angka.length; indeks++) {
            if (String.valueOf(angka[indeks]).contains("2")) {
                System.out.print(angka[indeks] + " ");
            }
            }
            System.out.println("");
        }
    }
