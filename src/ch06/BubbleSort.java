package ch06;

public class BubbleSort {
    static int bubblesort (int[] angka){

        for (int  indeks = 0 ; indeks < angka.length; indeks++) {
            for (int indeks2 = 0 ; indeks2 < angka.length - indeks - 1; indeks2++ ){
                if (angka[indeks2] > angka[indeks2+1]) {
                    int temp = angka[indeks2];
                    angka[indeks2] = angka[indeks2+1];
                    angka[indeks2+1] = temp;
                }
            }
        }
        return 1;
        }
    public static void main(String[] args) {
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        for (int indeks = 0;  indeks < angka.length; indeks++){
            System.out.print(angka[indeks] + ",");
        }
        System.out.println("");
        System.out.println("Mengurutkan nilai dari yang terkecil adalah : ");

        int bilangan = bubblesort(angka);
        for (int indeks = 0; indeks < angka.length; indeks++){
            System.out.print(angka[indeks] + ",");
        }
    }
}
