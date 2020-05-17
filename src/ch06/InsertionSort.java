package ch06;

public class InsertionSort {
    public static void main(String[] args) {
        int indeks;
        int indeks2;
        int ANGKA;
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.print("Angka sebelum diurutkan menggunakan Insertion Sort adalah \n: ");

        for (indeks = 0; indeks < angka.length; indeks++){
            System.out.print(angka[indeks] + " ");
        }
        for (indeks   = 1; indeks < angka.length; indeks++){
        ANGKA = angka[indeks];
        indeks2 = indeks;

        while ((indeks2 > 0) && (angka [indeks2 - indeks] > ANGKA)){
        angka [indeks2] = angka [indeks2 - 1];
            indeks2 = indeks2 - 1;
    }
        angka[indeks2] = ANGKA;
    }
        for (indeks = 1; indeks < angka.length; indeks++){
        ANGKA = angka[indeks];
            indeks2 = indeks;

        while ((indeks2 > 0) && (angka[indeks2 - 1] > ANGKA)){
            angka[indeks2] = angka[indeks2-1];
            indeks2 = indeks2 - 1;
    }
    angka[indeks2] = ANGKA;
}
        System.out.print("\n Angka setelah diurutkan menggunakan Insertion Sort menjadi : \n");
        for (indeks = 0; indeks < angka.length; indeks++){
            System.out.print(angka[indeks] + " ");
        }
    }
}