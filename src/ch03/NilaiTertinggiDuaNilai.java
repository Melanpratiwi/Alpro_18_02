package ch03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class NilaiTertinggiDuaNilai {
    public static void main(String[] args) {
        int nilai1;
        int nilai2;
        int nilaitertinggi;
        Scanner nilai = new Scanner(System.in);

        System.out.println(" Masukkan nilai1 :  ");
        nilai1 = nilai.nextInt();
        System.out.println(" Masukkan nilai2 : ");
        nilai2 = nilai.nextInt();

        if (nilai1 > nilai2) {
            System.out.println("Nilai tertinggi adalah : " + nilai1);
        } else {
            System.out.println("Nilai tertinggi adalah : " + nilai2);
        }
    }
}
