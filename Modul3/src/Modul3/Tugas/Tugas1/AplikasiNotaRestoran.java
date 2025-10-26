package Modul3.Tugas.Tugas1;

import java.util.Scanner;

public class AplikasiNotaRestoran {
    private static Scanner scanner = new Scanner(System.in);
    private static ManajerMenu manajerMenu = new ManajerMenu();

    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("      APLIKASI NOTA PEMESANAN RESTORAN");
        System.out.println("             RESTORAN BUNGA SARI");
        System.out.println("================================================");

        boolean lanjut = true;

        while (lanjut) {
            System.out.print("\nMasukkan nama pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            NotaPemesanan nota = new NotaPemesanan(namaPelanggan);

            prosesPemesanan(nota);

            System.out.print("\nApakah ada diskon khusus? (y/t): ");
            String adaDiskon = scanner.nextLine();
            if (adaDiskon.equalsIgnoreCase("y")) {
                System.out.print("Masukkan persentase diskon: ");
                double diskon = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                nota.setDiskon(diskon);
            }

            nota.cetakNota();

            System.out.print("\nApakah ingin membuat nota baru? (y/t): ");
            String jawaban = scanner.nextLine();
            lanjut = jawaban.equalsIgnoreCase("y");
        }

        System.out.println("\nTerima kasih telah menggunakan aplikasi!");
        scanner.close();
    }

    private static void prosesPemesanan(NotaPemesanan nota) {
        boolean tambahLagi = true;

        while (tambahLagi) {
            manajerMenu.tampilkanMenu();


            System.out.print("\nMasukkan kode menu yang dipesan: ");
            String kodeMenu = scanner.nextLine();

            Menu menuDipilih = manajerMenu.cariMenuByKode(kodeMenu);

            if (menuDipilih == null) {
                System.out.println("Kode menu tidak ditemukan!");
                continue;
            }

            System.out.print("Masukkan jumlah pesanan: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Masukkan catatan (opsional): ");
            String catatan = scanner.nextLine();

            nota.tambahPesanan(menuDipilih, quantity, catatan);

            System.out.print("\nTambah pesanan lain? (y/t): ");
            String jawaban = scanner.nextLine();
            tambahLagi = jawaban.equalsIgnoreCase("y");
        }
    }
}
