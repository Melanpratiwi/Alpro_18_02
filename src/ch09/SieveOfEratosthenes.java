package ch09;

public class SieveOfEratosthenes {
    void sieveOfEratosthenes(int angka) {

            boolean prima[] = new boolean[angka+1];
            for(int indeks  = 0; indeks < angka ;indeks++)
                prima[indeks] = true;

            for(int prim = 2; prim * prim <= angka; prim++)
            {
                if(prima[prim] == true)
                    for(int indeks2 = prim * 2 ; indeks2 <= angka; indeks2 += prim)
                        prima[indeks2] = false;
                }

            for(int indeks3 = 2; indeks3 <= angka; indeks3++)
            {
                if(prima[indeks3] == true)
                    System.out.print(indeks3 + " ");
            }
        }
        public static void main(String args[])
        {
            int n = 30;
            System.out.print("Angka Prima berikut ");
            System.out.println("angka yang lebih kecil dari " + n + ": ");
            SieveOfEratosthenes bil = new SieveOfEratosthenes();
            bil.sieveOfEratosthenes(n);
        }
    }
