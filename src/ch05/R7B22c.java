package ch05;

public class R7B22c {
            public int kandaneForMaxSubArray(int[] arr) {
                int besar = 0;
                int terbesar = 0;
                for (int i = 0; i < arr.length; i++) {
                    besar += arr[i];
                    if (besar < 0) {
                        besar = 0;
                    }
                    if (terbesar < besar) {
                        terbesar = besar;
                    }
                }
                return besar;
            }
            public int kandaneForMaxSubArrayForNegativ(int[] arr) {
                int besar = arr[0];
                int terbesar = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    besar = Math.max(arr[i], besar + arr[i]);
                    terbesar = Math.max(terbesar, besar);
                }
                return terbesar;
            }
            public static void main(String args[]) {
                int array[] = {3, 16, 12, -2, -5, 7, -1, 5};
                R7B22c nilakmaksimum = new R7B22c();
                System.out.println("Angka array terbesar adalah :  " + nilakmaksimum.kandaneForMaxSubArray(array));
                int negatif[] = {-8, -17, -4, -7, -10, -7, -78, -9};
                System.out.println("Angka terbesar dari array negatif adalah : " + nilakmaksimum.kandaneForMaxSubArrayForNegativ(negatif));
            }
}