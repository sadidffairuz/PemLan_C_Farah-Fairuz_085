package Modul2.Tugas.Tugas3.sebelumRefactoring;

import java.util.ArrayList;

public class PengingatMinumObat {
    public static void main(String[] args) {
        ArrayList<String> namaObat = new ArrayList<>();
        ArrayList<String> dosis = new ArrayList<>();
        ArrayList<String> jadwal = new ArrayList<>();

        namaObat.add("Paracetamol");
        dosis.add("500mg");
        jadwal.add("08.00 Pagi");

        namaObat.add("Amoxicillin");
        dosis.add("250mg");
        jadwal.add("20.00 Malam");

        System.out.println("=== PENGINGAT MINUM OBAT ===");
        for (int i = 0; i < namaObat.size(); i++) {
            System.out.println("Nama Obat   : " + namaObat.get(i));
            System.out.println("Dosis       : " + dosis.get(i));
            System.out.println("Jadwal      : " + jadwal.get(i));
            System.out.println("-----------------------------");
        }
        System.out.println("Interval pengingat setiap 3 jam sekali.");
    }
}
