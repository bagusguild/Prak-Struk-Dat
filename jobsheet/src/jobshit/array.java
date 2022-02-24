package jobshit;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int stok [][] = {{10,8,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};

        int aglonema = stok[0][0] + stok[1][0] + stok[2][0] + stok[3][0];
        int keladi = stok[0][1] + stok[1][1] + stok[2][1] + stok[3][1];
        int alocasia = stok[0][2] + stok[1][2] + stok[2][2] + stok[3][2];
        int mawar = stok[0][3] + stok[1][2] + stok[2][3] + stok[3][3];

        System.out.println("A. Jumlah stock bunga pada seluruh cabang");
        System.out.println("Aglonema\t: "+aglonema);
        System.out.println("Keladi\t\t: "+keladi);
        System.out.println("Alocasia\t: "+alocasia);
        System.out.println("Mawar\t\t: "+mawar);

        int a = stok[0][0] - 1;
        int b = stok[0][1] - 2;
        int c = stok[0][2] - 0;
        int d = stok[0][3] - 5;

        System.out.println("");
        System.out.println("B. Stelah pengurangan stock karena bunga mati pada toko royal graden 1");
        System.out.println("Aglonema\t: "+a);
        System.out.println("Keladi\t\t: "+b);
        System.out.println("Alocasia\t: "+c);
        System.out.println("Mawar\t\t: "+d);

        int pendapatan = (a*75000)+(b*50000)+(c*60000)+(d*10000);
        System.out.println("");
        System.out.println("Pendapatan royal garden 1 adalah sebesar : "+pendapatan);
    }    
}