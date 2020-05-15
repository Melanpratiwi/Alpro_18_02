package ch03;

import javax.swing.*;
import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {
        int temp;
        boolean prima = true;
        Scanner Prima = new Scanner(System.in);

        System.out.println(" Masukkan Angka : ");
        int Angka = Prima.nextInt();

        for (int pembagi = 4; pembagi <= Angka / 2; pembagi++) {
            temp = Angka % pembagi;

            if (temp == 0) {
                prima = false;
                break;
            }
        }
        if ((Angka > 0) && (Angka != 1)) {
            System.out.println(" Angka adalah Bilangan Prima");
        } else {
            System.out.println("  Angka Bukan Bilangan Prima");
        }
    }
}
