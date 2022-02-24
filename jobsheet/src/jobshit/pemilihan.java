package jobshit;

import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");
        System.out.print("Masukkan nilai tugas\t:");
        int t = s.nextInt();
        System.out.print("Masukkan nilai UTS\t:");
        int ut = s.nextInt();
        System.out.print("Masukkan nilai UAS\t:");
        int ua = s.nextInt();

        float nilaiAKhir;
        String nilaiHuruf;
        nilaiAKhir = (float)((0.2*t)+(0.36*ut)+(0.45*ua));
        System.out.println("Nilai akhir\t: "+nilaiAKhir);

        if(nilaiAKhir >80 && nilaiAKhir <= 100){
            nilaiHuruf="A";
            System.out.println("Nilai huruf\t: "+nilaiHuruf);
            System.out.println("Selamat anda lulus");
        }
        else if(nilaiAKhir > 73 && nilaiAKhir <= 80){
            nilaiHuruf="B+";
            System.out.println("Nilai huruf\t: "+nilaiHuruf);
            System.out.println("Selamat anda lulus");
        }
        else if(nilaiAKhir > 65 && nilaiAKhir <= 73){
            nilaiHuruf="B";
            System.out.println("Nilai huruf\t: "+nilaiHuruf);
            System.out.println("Selamat anda lulus");

        }
        else if(nilaiAKhir > 60 && nilaiAKhir <= 65){
            nilaiHuruf="C+";
            System.out.println("Nilai huruf\t: "+nilaiHuruf);
            System.out.println("Selamat anda lulus");
        }
        else if(nilaiAKhir > 50 && nilaiAKhir <= 60){
            nilaiHuruf="C";
            System.out.println("Nilai huruf\t: "+nilaiHuruf);
            System.out.println("Selamat anda lulus");
        }
        else if(nilaiAKhir > 39 && nilaiAKhir <= 50){
            nilaiHuruf="D";
            System.out.println("Nilai huruf\t: "+nilaiHuruf);
            System.out.println("Maaf anda tidak lulus");
        }
        else {
            nilaiHuruf="F";
            System.out.println("Nilai huruf\t: "+nilaiHuruf);
            System.out.println("Maaf anda tidak lulus");
        }
    }  
}