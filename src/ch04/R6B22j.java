package ch05;

public class R6B22j {
    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int selisihangka = 0;

        for (int indeks = 0; indeks < angka.length; indeks++){
            if (angka[indeks] % 2 == 0){

                for (int indeks2 = indeks + 1; indeks2 < angka.length; indeks2++)
                    if (angka[indeks2] % 2 == 0){
                        selisihangka = angka[indeks] - angka[indeks2];
                        System.out.println(selisihangka);
                    }
            }
        }
    }
}
