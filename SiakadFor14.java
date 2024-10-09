package Pertemuan7;

import java.util.Scanner;

public class SiakadFor14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int mhsLulus = 0, mhsTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai ke-" + i + " : ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                mhsLulus++;
            } else {
                mhsTidakLulus++;
            }

        }

        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa lulus : " + mhsLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + mhsTidakLulus);

        sc.close();
    }
}