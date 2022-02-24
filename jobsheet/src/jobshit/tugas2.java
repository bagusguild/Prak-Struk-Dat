import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai kecepatan : ");
        Double k = sc.nextDouble();
        System.out.print("Masukkan nilai Jarak : ");
        Double j = sc.nextDouble();
        System.out.print("Masukkan nilai Waktu : ");
        Double t = sc.nextDouble();
        do{
            System.out.println(" ");
            System.out.println("\n<---------- Rumus Kecepatan Jarak dan Waktu ----------->\n");
            System.out.println("==========================================================");
            System.out.println("[1] Hitung Kecepatan\t\t");
            System.out.println("[2] Hitung Jarak\t");
            System.out.println("[3] Hitung Waktu\t");
            System.out.print("Pilih menu [ 1 - 3 ] : ");
            int menu = sc.nextInt();
            System.out.println(" ");
            switch (menu) {
                case 1: 
                System.out.print("Kecepatannya adalah " + kecepatan(j,t));
                break;

                case 2: 
                System.out.print("Jaraknya adalah " + jarak(k,t));
                break;

                case 3: 
                System.out.print("Kecepatannya adalah " + waktu(j,k));
                break;
            }
            System.out.println();
        } while (true);
    }
    static Double kecepatan(Double j, Double t){
        Double k = j/t;
        return k;
    }
    static Double jarak(Double kec, Double w){
        Double j = k*t;
        return j;
    }
    static Double waktu(Double jK, Double kec){
        Double t = j/k;
        return t;
    }

}