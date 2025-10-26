package Modul2.Tugas.Tugas3.SesudahRefactoring;

import java.util.ArrayList;

public class Pengingat implements AksiPengingat {
/*    private ArrayList<Obat> daftarObat = new ArrayList<>();
    private static final int MAX_OBAT = 10;

    // 4.) Rename Method (dari tambah → tambahObat)
    public void tambahObat(Obat o) {
        if (daftarObat.size() < MAX_OBAT) {
            daftarObat.add(o);
            System.out.println("Obat berhasil ditambahkan!");
        } else {
            System.out.println("Daftar obat penuh!");
        }
    }

    // 5.) Extract Method
    private boolean isValidJumlah() {
        return daftarObat.size() <= MAX_OBAT;
    }

    // 6.) Extract Method (pisahkan detail tampilan)
    public void tampilkanSemua() {
        if (!isValidJumlah()) {
            System.out.println("Terlalu banyak obat untuk ditampilkan!");
            return;
        }

        for (Obat o : daftarObat) {
            System.out.println("-------------------");
            o.tampilkanDetailObat();
        }
    }*/

    private ArrayList<Obat> daftarObat = new ArrayList<>();
    private static final int INTERVAL_JAM = 3;

    public void tambahObat(Obat obat) {
        daftarObat.add(obat);
    }

    @Override
    public void tampilkanPengingat() {
        tampilkanHeader();
        tampilkanDetailObat();
    }

    private void tampilkanHeader() {
        System.out.println("=== PENGINGAT MINUM OBAT ===");
        System.out.println("Interval pengingat setiap " + INTERVAL_JAM + " jam sekali.\n");
    }

    private void tampilkanDetailObat() {
        for (Obat o : daftarObat) {
            System.out.println("Nama Obat   : " + o.getNama());
            System.out.println("Dosis       : " + o.getDosis());
            System.out.println("Jadwal      : " + o.getJadwal());
            System.out.println("-----------------------------");
        }
    }
}
