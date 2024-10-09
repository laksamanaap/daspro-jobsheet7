package Pertemuan7;

import java.util.Scanner;

public class TugasP7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan");
            System.out.println("1. Mobil, 2. Motor, 0. Keluar");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);

        sc.close();
    }
}
