package Modul3.Tugas.Tugas1;

public class Menu {
    private String kode;
    private String nama;
    private double harga;
    private String kategori;

    public Menu(String kode, String nama, double harga, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

    @Override
    public String toString() {
        return String.format("%s - %s | Rp %,.0f", kode, nama, harga);
    }
}
