package Modul2.Tugas.Tugas3.SesudahRefactoring;

public class main {
/*    public static void main(String[] args) {
        Pengingat pengingat = new Pengingat();

        Obat o1 = new Obat("Paracetamol", "08.00 - Pagi");
        Obat o2 = new Obat("Amoxicillin", "20.00 - Malam");

        pengingat.tambahObat(o1);
        pengingat.tambahObat(o2);

        pengingat.tampilkanSemua();
    }*/

    public static void main(String[] args) {
        Pengingat pengingat = new Pengingat();

        Obat obat1 = new Obat("Paracetamol", "500mg", "08.00 Pagi");
        Obat obat2 = new Obat("Amoxicillin", "250mg", "20.00 Malam");

        pengingat.tambahObat(obat1);
        pengingat.tambahObat(obat2);

        pengingat.tampilkanPengingat();
    }
}
