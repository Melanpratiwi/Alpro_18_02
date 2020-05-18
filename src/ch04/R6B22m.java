package ch05;

public class R6B22m {
    public static void main(String[] args) {

        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int total = 0;
        System.out.println("Nilai array ini adalah : ");
        int indeks;
        int indeks2;

        for (indeks = 0; indeks < angka.length; indeks++) {
            System.out.print(angka[indeks] + " ");
        }
        System.out.println();

        int selisihangka = angka[0] - angka[1];
        for (indeks = 0; indeks < angka.length; indeks++) {
            if (indeks == angka.length - 1) {
            } else {
                selisihangka = angka[indeks] - angka[indeks + 1];
                System.out.println("Selisih " + angka[indeks] + " dengan " + angka[indeks + 1] + " adalah = " + selisihangka);
                total = total + selisihangka;
            }
        }
    }
}
