package ch09;

import java.util.Arrays;
public class SieveOfSundaram {
        static int SieveOfSundaram(int angka) {

            int angkaNew = (angka - 2) / 2;

            boolean bilangan[] = new boolean[angkaNew + 1];

            Arrays.fill(bilangan, false);

            for (int indeks = 1; indeks <= angkaNew; indeks++)
                for (int indeks2 = indeks; (indeks + indeks2 + 2 * indeks * indeks2) <= angkaNew; indeks2++)
                    bilangan[indeks + indeks2 + 2 * indeks * indeks2] = true;

            if (angka > 2)
                System.out.print(2 + " ");

            for (int indeks3 = 1; indeks3 <= angkaNew; indeks3++)
                if (bilangan[indeks3] == false)
                    System.out.print(2 * indeks3 + 1 + " ");
            return -1;
        }
        public static void main(String[] args) {
            int n = 20;
            SieveOfSundaram(n);
        }
    }
