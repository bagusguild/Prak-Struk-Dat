package jobshit;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nim, n;
    
        System.out.println("Masukkan NIM : ");
        nim = sc.nextInt();
        System.out.println("----------------");

        n = nim - 2141720000;

        if(n < 10){
            n += 10;
            System.out.println(" n : "+n);
        }
        for(int i=0; i<n;i++){
            int hari = i%7;
            switch(hari){
                case 0:
                    System.out.print("Senin");
                    break;
                case 1:
                    System.out.print("Senin");
                    break;
                case 2:
                    System.out.print("Senin");
                    break;
                case 3:
                    System.out.print("Senin");
                    break;
                case 4:
                    System.out.print("Senin");
                    break;
                case 5:
                    System.out.print("Senin");
                    break;
                case 6:
                    System.out.print("Senin");
                    break;
                default:
                    break;
            }
        }
    }
}