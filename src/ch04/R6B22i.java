package ch04;

public class R6B22i {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int selisih;
        System.out.print("Selisih angka dari array ini adalah :");
        for (int indeks = 0; indeks < angka.length - 1; indeks ++) {
                selisih = angka[indeks + 1] - angka[indeks];
                System.out.print(selisih + " ");
            }
        }
    }