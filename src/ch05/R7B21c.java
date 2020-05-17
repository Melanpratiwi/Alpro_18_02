package ch05;

import java.util.Scanner;
public class R7B21c {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai x :");
        x = sc.nextInt();

        System.out.print("Masukkan Nilai y :");
        y = sc.nextInt();
        System.out.println();

        z = y % x;

do {
    x = y;
    y = z;
    z = x % y;
}while (z != 0);

        System.out.println("Faktor Persekutuan Terbesar adalah : " + y);
    }
}