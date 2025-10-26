package Modul3.Tugas.Tugas1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NotaPemesanan {
    private static int counterNota = 1;

    private String noNota;
    private String namaPelanggan;
    private Date tanggal;
    private ArrayList<ItemPesanan> daftarPesanan;
    private double pajak;
    private double diskon;

    public NotaPemesanan(String namaPelanggan) {
        this.noNota = "NOTA-" + String.format("%04d", counterNota++);
        this.namaPelanggan = namaPelanggan;
        this.tanggal = new Date();
        this.daftarPesanan = new ArrayList<>();
        this.pajak = 10.0; // PPN 10%
        this.diskon = 0.0;
    }

    public void tambahPesanan(Menu menu, int quantity, String catatan) {
        daftarPesanan.add(new ItemPesanan(menu, quantity, catatan));
        System.out.println("✓ " + menu.getNama() + " ditambahkan ke pesanan");
    }

    public double hitungSubtotal() {
        double subtotal = 0;
        for (ItemPesanan item : daftarPesanan) {
            subtotal += item.getSubtotal();
        }
        return subtotal;
    }

    public static double hitungTotalAkhir(double subtotal, double taxRate, double discount) {
        double pajak = subtotal * (taxRate / 100);
        double diskon = subtotal * (discount / 100);
        return subtotal + pajak - diskon;
    }


    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public void cetakNota() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("           RESTORAN BUNGA SARI");
        System.out.println("       Jl. Melati No. 123, Jakarta");
        System.out.println("           Telp: (021) 123-4567");
        System.out.println("=".repeat(50));

        System.out.println("No. Nota    : " + noNota);
        System.out.println("Pelanggan   : " + namaPelanggan);
        System.out.println("Tanggal     : " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(tanggal));
        System.out.println("-".repeat(50));

        System.out.printf("%-3s %-20s %-8s %-10s %-10s\n",
                "No", "Menu", "Qty", "Harga", "Subtotal");
        System.out.println("-".repeat(50));

        int no = 1;
        for (ItemPesanan item : daftarPesanan) {
            Menu menu = item.getMenu();
            System.out.printf("%-3d %-20s %-8d %-10.0f %-10.0f\n",
                    no++,
                    menu.getNama(),
                    item.getJumlah(),
                    menu.getHarga(),
                    item.getSubtotal());

            if (!item.getCatatan().isEmpty()) {
                System.out.println("     Catatan: " + item.getCatatan());
            }
        }

        System.out.println("-".repeat(50));
        double subtotal = hitungSubtotal();
        double totalPajak = subtotal * (pajak / 100);
        double totalDiskon = subtotal * (diskon / 100);
        double totalAkhir = hitungTotalAkhir(subtotal, pajak, diskon);

        System.out.printf("%-35s: Rp %10.0f\n", "Subtotal", subtotal);
        System.out.printf("%-35s: Rp %10.0f (%2.0f%%)\n", "Pajak (PPN)", totalPajak, pajak);
        System.out.printf("%-35s: Rp %10.0f (%2.0f%%)\n", "Diskon", totalDiskon, diskon);
        System.out.printf("%-35s: Rp %10.0f\n", "TOTAL AKHIR", totalAkhir);

        System.out.println("=".repeat(50));
        System.out.println("     Terima kasih atas kunjungan Anda!");
        System.out.println("=".repeat(50));
    }

    public String getNoNota() {
        return noNota;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public ArrayList<ItemPesanan> getDaftarPesanan() {
        return daftarPesanan;
    }

    public double getPajak() {
        return pajak;
    }

    public double getDiskon() {
        return diskon;
    }

}
