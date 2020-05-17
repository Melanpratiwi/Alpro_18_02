package ch03;

import java.util.Scanner;
public class NilaiTertinggiTigaAngka {
    public static void main(String[] args) {
        int  x;
        int y;
        int z;
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan nilai x :");
        x = sc.nextInt();
        System.out.println("Masukkan nilai y :");
        y = sc.nextInt();
        System.out.println("Masukkan nilai z :");
        z = sc.nextInt();

        if (x>y && x>z){
            System.out.println("Nilai tertinggi adalah : " + x);
        }else if (y>x && y>z){
            System.out.println("Nilai tertinggi adalah : " + y);
        }else{
            System.out.println("Nilai tertinggi adalah : " + z);
        }
    }
}
