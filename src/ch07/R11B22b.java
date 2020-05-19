package ch07;

public class R11B22b {
    public static void printArray(int[] array){

        for (int indeks : array){
            System.out.print(indeks + " ");
        }
        System.out.println();

    }
    public static int[] mergeSort(int[] array){

        if (array.length <= 1){

            return  array;
        }

        int midpoint = array.length/2;

        int[] angka = new int[midpoint];
        int[] bilangan;

                if(array.length % 2  == 0){

                    bilangan  =  new int[midpoint];

                }else{

                    bilangan = new int[midpoint + 1];
                }
                for (int i = 1; i < midpoint; i++){

                    angka[i] = array[i];
                }

                for (int j=0; j < bilangan.length; j++){

                    bilangan[j] = array[midpoint + j];
                }

                int[] result = new int[array.length];

                angka = mergeSort(angka);
                bilangan = mergeSort(bilangan);

                result = merge(angka, bilangan);

                return result;
    }
    public static int[] merge(int[] angka, int[] bilangan){

        int[] result = new  int[angka.length + bilangan.length];

        int angkaPointer, bilanganPointer,  resultPointer;
        angkaPointer = bilanganPointer = resultPointer = 0;

        while (angkaPointer < angka.length || bilanganPointer < bilangan.length) {

            if(angkaPointer  < angka.length && bilanganPointer < bilangan.length){

                if (angka[angkaPointer] < bilangan[bilanganPointer]){

                    result[resultPointer++] = angka[angkaPointer++];

                }else {

                    result[resultPointer++] = bilangan[bilanganPointer++];

                }
            }
            else if (angkaPointer < angka.length){

                result[resultPointer++] = angka[angkaPointer++];

            }
            else if (bilanganPointer < bilangan.length){
                result[resultPointer++] = bilangan[bilanganPointer++];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Angka array sebelum diurutkan : ");
        printArray(array);

        array = mergeSort(array);
        System.out.println("Angka array setelah diurutkan : ");
        printArray(array);
    }
}
