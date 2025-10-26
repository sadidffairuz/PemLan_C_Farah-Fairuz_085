package Modul2.Tugas.Tugas3.SesudahRefactoring;

// 1.) encapsulate field
public class Obat extends Item {
/*    private String namaObat;
    private String jadwal;

    public Obat(String namaObat, String jadwal) {
        this.namaObat = namaObat;
        this.jadwal = jadwal;
    }

    // Getter dan Setter
    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    // 2.) Extract Method (dari tampilkanSemua di class Pengingat)
    public void tampilkanDetailObat() {
        System.out.println("Nama Obat: " + namaObat);
        System.out.println("Jadwal Minum: " + jadwal);
    }*/

    private String dosis;
    private String jadwal;

    public Obat(String nama, String dosis, String jadwal) {
        super(nama);
        this.dosis = dosis;
        this.jadwal = jadwal;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }
}
