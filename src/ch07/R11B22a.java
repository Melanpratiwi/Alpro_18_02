package ch07;

public class R11B22a {
    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int temp = 0;

        for (int indeks=0; indeks < angka.length; indeks++){
            for ( int indeks2 = 0; indeks2 < angka.length; indeks2++){
                if (angka[indeks] < angka[indeks2]){
                    temp = angka[indeks];
                    angka[indeks] = angka[indeks2];
                    angka [indeks2] = temp;
                }
            }
        }
        for (int indeks = 0; indeks < 13; indeks++){
            System.out.println(angka[indeks] + " ");
        }
    }
}
