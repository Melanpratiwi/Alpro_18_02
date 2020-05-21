package ch09;

public class AKSPrimalityTest {
    static long c[] = new long[100];

    static void coef(int angka) {

        c[0] = 1;
        for (int indeks = 0; indeks < angka; c[0] = -c[0], indeks++) {
            c[1 + indeks] = 1;

            for (int indeks2 = indeks; indeks2 > 0; indeks2--)
                c[indeks2] = c[indeks2 - 1] - c[indeks2];
        }
    }

    static boolean isPrime(int n) {
        coef(n);

        c[0]++;
        c[n]--;

        int i = n;
        while ((i--) > 0 && c[i] % n == 0) ;

        return i < 0;
    }

    public static void main(String[] args) {
    }

    int n = 37;
        if (isPrime(n)) {
                System.out.println("Prime");
    }else{
                System.out.println("Not Prime");
    }
