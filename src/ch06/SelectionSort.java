package ch06;

public class SelectionSort {
    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        printArray(angka, "Angka sebelum di urutkan menggunakan selection sort adalah : ");

        selectionSort(angka);

        printArray(angka, "Angka setelah diurutkan menggunakan selection sort adalah : ");
    }

    public static void selectionSort(int[] arr) {

        for (int indeks = 0; indeks < arr.length; indeks++) {
            int minIndex = indeks;
            for (int indeks2 = indeks + 1; indeks2 < arr.length; indeks2++) {
                if (arr[indeks2] < arr[minIndex]) {
                    minIndex = indeks2;
                }
            }
            if (minIndex != indeks) {
                int tmp = arr[indeks];
                arr[indeks] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }
    public static void printArray(int[] arr, String msg) {
        System.out.print(msg);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

