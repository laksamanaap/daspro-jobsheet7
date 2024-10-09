package Pertemuan7;

import java.util.Scanner;

public class TugasP7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiket = 0, hargaTiket = 50000;
        double totalPendapatan = 0, hargaTotal, diskon = 0, hargaSetelahDiskon;
        char lanjut;

        do {
            int jumlahTiket;

            do {
                System.out.print("Masukkan jumlah tiket yang dibeli: ");
                jumlahTiket = sc.nextInt();

                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid. Silakan input ulang.");
                }
            } while (jumlahTiket < 0);

            hargaTotal = jumlahTiket * hargaTiket;
            diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15; // 15%
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // 10%
            }

            hargaSetelahDiskon = hargaTotal * (1 - diskon);

            System.out.println("Detail Pembelian:");
            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Harga per tiket: Rp " + hargaTiket);
            System.out.println("Total harga: Rp " + (int) hargaTotal);
            if (diskon > 0) {
                System.out.println("Diskon: " + (int) (diskon * 100) + "%");
                System.out.println("Harga setelah diskon: Rp " + (int) hargaSetelahDiskon);
            }

            totalTiket += jumlahTiket;
            totalPendapatan += hargaSetelahDiskon;

            System.out.print("Ada pembelian lain? (y/n): ");
            lanjut = sc.next().charAt(0);

        } while (lanjut == 'y' || lanjut == 'Y');

        System.out.println("=== Ringkasan Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + (int) totalPendapatan);

        sc.close();

    }
}
