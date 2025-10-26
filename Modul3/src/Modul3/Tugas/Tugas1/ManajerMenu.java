package Modul3.Tugas.Tugas1;

import java.util.ArrayList;

public class ManajerMenu {
    private ArrayList<Menu> daftarMenu;

    public ManajerMenu() {
        this.daftarMenu = new ArrayList<>();
        inisialisasiMenu();
    }

    private void inisialisasiMenu() {
        daftarMenu.add(new Menu("M001", "Nasi Goreng Spesial", 25000, "Makanan Utama"));
        daftarMenu.add(new Menu("M002", "Mie Ayam Bakso", 20000, "Makanan Utama"));
        daftarMenu.add(new Menu("M003", "Gado-gado", 18000, "Makanan Utama"));
        daftarMenu.add(new Menu("M004", "Sate Ayam (10 tusuk)", 30000, "Makanan Utama"));

        daftarMenu.add(new Menu("D001", "Es Teh Manis", 8000, "Minuman"));
        daftarMenu.add(new Menu("D002", "Jus Jeruk", 12000, "Minuman"));
        daftarMenu.add(new Menu("D003", "Kopi Hitam", 10000, "Minuman"));
        daftarMenu.add(new Menu("D004", "Es Kelapa Muda", 15000, "Minuman"));

        daftarMenu.add(new Menu("S001", "Es Krim Vanilla", 12000, "Dessert"));
        daftarMenu.add(new Menu("S002", "Puding Coklat", 10000, "Dessert"));
        daftarMenu.add(new Menu("S003", "Kue Lapis", 8000, "Dessert"));
    }

    public void tampilkanMenu() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("                   DAFTAR MENU RESTORAN");
        System.out.println("=".repeat(60));

        String kategoriSekarang = "";
        for (Menu menu : daftarMenu) {
            if (!menu.getKategori().equals(kategoriSekarang)) {
                kategoriSekarang = menu.getKategori();
                System.out.println("\n" + kategoriSekarang.toUpperCase() + ":");
                System.out.println("-".repeat(40));
            }
            System.out.println(menu);
        }
        System.out.println("=".repeat(60));
    }

    public Menu cariMenuByKode(String kode) {
        for (Menu menu : daftarMenu) {
            if (menu.getKode().equalsIgnoreCase(kode)) {
                return menu;
            }
        }
        return null;
    }
}
