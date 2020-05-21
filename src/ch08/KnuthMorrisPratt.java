package ch08;

import java.util.Scanner;
public class KnuthMorrisPratt {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String bilangan = x.next();
        String target = x.next();
        int result = KMP (bilangan, target);

        if (result == -1){
            System.out.println("Tidak");
        }else{
            System.out.println("Ya");
        }
    }
    public static int KMP (String cari, String target){
        int[] failureTable = failureTable(target);

        int targetPointer = 0;
        int cariPointer = 0;

        while (cariPointer < cari.length()){
            if (cari.charAt(cariPointer) == target.charAt(targetPointer)){
                targetPointer++;

                if (targetPointer == target.length()) {
                    int x = target.length() + 1;

                    return  cariPointer - x;
                }
                cariPointer++;
            }else if (targetPointer > 0) {
                targetPointer = failureTable[targetPointer];
            }else {
                cariPointer++;
            }
        }
        return -1;
    }
    public  static int[] failureTable(String target){
        int[] table = new  int[target.length() + 1];
        table[0] = -1;
        table[1] = 0;

        int pertama = 0;
        int kedua = 2;

        while (kedua < table.length){
            if (target.charAt(kedua - 1) == target.charAt(pertama)){
                pertama++;
                table[kedua] = pertama;
                kedua++;

            }else if (pertama > 0){
                pertama = table[pertama];
            }else {
                table[kedua] = pertama;
                kedua++;
            }
        }
        return table;
    }
}
