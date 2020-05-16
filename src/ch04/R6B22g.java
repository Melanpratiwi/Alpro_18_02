package ch04;

public class R6B22g {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Angka Kelipatan 5 dari array ini adalah :");
        for (int indeks = 0; indeks < angka.length; indeks++) {
            if (angka[indeks] % 5 == 0) {
                System.out.print(angka[indeks] + " ");
            }
        }
        System.out.println("");
    }
}

