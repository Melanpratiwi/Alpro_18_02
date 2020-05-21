package ch09;

public class SieveOfAtkin {
        static int SieveOfAtkin(int angka)
        {

            if (angka > 2)
                System.out.print(2 + " ");

            if (angka > 3)
                System.out.print(3 + " ");

            boolean bilangan[] = new boolean[angka];

            for (int indeks = 0; indeks < angka; indeks++)
                bilangan[indeks] = false;

            for (int x = 1; x * x < angka; x++) {
                for (int y = 1; y * y < angka; y++) {

                    int n = (4 * x * x) + (y * y);
                    if (n <= angka && (n % 12 == 1 || n % 12 == 5))

                        bilangan[n] ^= true;

                    n = (3 * x * x) + (y * y);
                    if (n <= angka && n % 12 == 7)
                        bilangan[n] ^= true;

                    n = (3 * x * x) - (y * y);
                    if (x > y && n <= angka && n % 12 == 11)
                        bilangan[n] ^= true;
                }
            }
            for (int indeks2 = 5; indeks2 * indeks2 < angka; indeks2++) {
                if (bilangan[indeks2]) {
                    for (int indeks = indeks2 * indeks2; indeks < angka;
                         indeks += indeks2 * indeks2)
                        bilangan[indeks] = false;
                }
            }
            for (int a = 5; a < angka; a++)
                if (bilangan[a])
                    System.out.print(a + " ");
            return 0;
        }
        public static void main(String[] args)
        {
            int limit = 20;
            SieveOfAtkin(limit);
        }
    }
