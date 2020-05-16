package ch04;

public class R6B22h {
    public static void total(int[]data){
        int JumlahAngka = 0;
        for (int indeks = 0; indeks < data.length; indeks++) {
            JumlahAngka += data[indeks];
        }
        System.out.println("Jumlah Angka pada array ini adalah = " + JumlahAngka);
    }

    public static void main(String[] args) {
        int angka[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        total(angka);
    }
}
