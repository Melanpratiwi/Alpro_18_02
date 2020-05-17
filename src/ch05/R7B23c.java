package ch05;

public class R7B23c {
    int max (int x, int y) {
        return ( x > y ) ? x : y;
    }
    public static void main(String[] args) {
        R7B23c lcs = new R7B23c();
        String pertama = "MELAN";
        String Kedua = "DINDA";

        char [] nama1 = pertama.toCharArray();
        char [] nama2 = Kedua.toCharArray();
        int A = nama1.length;
        int B = nama2.length;

        System.out.println("Length dari LCS ini adalah :" + " "  + pertama + "  " + Kedua );

    }
}

