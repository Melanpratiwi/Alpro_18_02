package ch03;

import java.util.Scanner;
public class BilanganPembagiTerkecil {
    public static void main(String[] args) {
        int bilangan;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Bilangan : ");
        bilangan = sc.nextInt();

        for (int  n=3 ; n < bilangan; n++) {
            if (bilangan % n == 0){
                System.out.println(n);
                break;

            }

        }
    }
}
