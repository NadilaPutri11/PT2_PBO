package com.mycompany.resepmakanan;

import java.util.Scanner;
import model.resep;
import service.resepservice;

public class Resepmakanan {
    
    // Validasi input
    private static int inputAngka(Scanner input, String pesan) {
        while (true) {
            System.out.print(pesan);
            String data = input.nextLine();
            if (data.matches("\\d+")) {
                return Integer.parseInt(data);
            } else {
                System.out.println("Input hanya boleh berupa angka!");
            }
        }
    }

    public static void main(String[] args) {
        resepservice service = new resepservice();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU MANAJEMEN RESEP MASAKAN ===");
            System.out.println("1. Tambah Resep");
            System.out.println("2. Lihat Resep");
            System.out.println("3. Ubah Resep");
            System.out.println("4. Hapus Resep");
            System.out.println("5. Cari Resep");
            System.out.println("6. Keluar");

            int pilihan = inputAngka(input, "Pilih menu: ");

            if (pilihan == 1) {
                System.out.print("Masukkan nama masakan: ");
                String nama = input.nextLine();
                System.out.print("Masukkan bahan utama: ");
                String bahan = input.nextLine();
                int lama = inputAngka(input, "Masukkan lama memasak (menit): ");
                resep dataResep = new resep(nama, bahan, lama);
                service.tambahResep(dataResep);

            } else if (pilihan == 2) {
                service.lihatResep();

            } else if (pilihan == 3) {
                service.lihatResep();
                if (!service.isEmpty()) {
                    int index = inputAngka(input, "Nomor resep yang ingin diubah: ") - 1;
                    if (index < 0 || index >= service.getJumlahResep()) {
                        System.out.println("Nomor resep tidak valid.");
                    } else {
                        System.out.print("Masukkan nama masakan baru: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan bahan utama baru: ");
                        String bahan = input.nextLine();
                        int lama = inputAngka(input, "Masukkan lama memasak baru (menit): ");
                        resep resepDiperbarui = new resep(nama, bahan, lama);
                        service.ubahResep(index, resepDiperbarui);
                    }
                }
                
            } else if (pilihan == 4) {
                service.lihatResep();
                if (!service.isEmpty()) {
                    int index = inputAngka(input, "Nomor resep yang ingin dihapus: ") - 1;
                    service.hapusResep(index);
                }
            } else if (pilihan == 5) {
                if (!service.isEmpty()) {
                    System.out.print("Masukkan kata kunci nama resep: ");
                    String keyword = input.nextLine();
                    service.cariResep(keyword);
                } else {
                    System.out.println("Belum ada resep untuk dicari.");
                }
                
            } else if (pilihan == 6) {
                System.out.println("Terima kasih sudah mencoba manajemen resep masakan kami, semoga membantu untuk mengingat masakan Anda yang lezat!");
                break;

            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }

        input.close();
    }
}