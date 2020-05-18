package ch05;

public class R6B22l {
    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.print(" Jumlah angka dengan angka sebelahnya dengan hasil genap adalah : ");

        for (int indeks = 0; indeks < angka.length - 1; indeks++){
            int jumlah = angka[indeks] + angka[indeks + 1];
                if (jumlah % 2 == 0)
                    System.out.print(jumlah + " ");
        }
        System.out.print(" ");
    }
}
