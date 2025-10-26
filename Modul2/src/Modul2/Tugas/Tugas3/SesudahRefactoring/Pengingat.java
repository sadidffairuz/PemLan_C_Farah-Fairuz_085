package Modul2.Tugas.Tugas3.SesudahRefactoring;

import java.util.ArrayList;

public class Pengingat {
    private ArrayList<Obat> daftarObat = new ArrayList<>();
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
    }
}
