package Pertemuan7;

import java.util.Scanner;

public class KafeDoWhile14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, totalHarga,
                hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Masukkan jumlah pembelian Kopi : ");
            kopi = sc.nextInt();
            System.out.print("Masukkan jumlah pembelian Teh : ");
            teh = sc.nextInt();
            System.out.print("Masukkan jumlah pembelian Roti : ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total Harga : " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
        sc.close();

    }
}
