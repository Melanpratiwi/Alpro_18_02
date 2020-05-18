package ch05;

public class R6B22k {
    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        for (int indeks = 0; indeks < 12; indeks++){
            int indeks2 = indeks + 1;
            int indeks3 = angka[indeks2];
                if (angka[indeks] < indeks3){
                    System.out.println(angka[indeks2]);
                }
        }
    }
}
