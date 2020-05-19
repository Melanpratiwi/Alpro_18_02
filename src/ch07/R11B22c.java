package ch07;

public class R11B22c {
    static int temp;
    static void Cocktail(int indeks[], int x)
    {
        boolean cocktail = true;
        int bilangan = 0,i;
        int angka = x - 1;

        while (cocktail) {
            cocktail = false;
            for (i = bilangan; i < angka; ++i) {
                if (indeks[i] > indeks[i + 1]) {
                    temp = indeks[i];
                    indeks[i]=indeks[i+1];
                    indeks[i+1]=temp;
                    cocktail = true;
                }
            }
            if (!cocktail)
                break;
            cocktail = false;
            for (i = angka - 1; i >= bilangan; --i) {
                if (indeks[i] > indeks[i + 1])
                {
                    temp = indeks[i];
                    indeks[i]= indeks[i+1];
                    indeks[i+1]=temp;
                    cocktail = true;
                }
            }
            ++bilangan;
        }
    }
    public static void main(String[] args) {

        int arr[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3},i;
        int n = arr.length;
        Cocktail(arr, n);
        System.out.println("Array setekah diurutkan menggunakan Cocktail adalah :\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
