package Modul3.Tugas.Tugas1;

public class ItemPesanan {
    private Menu menu;
    private  int jumlah;
    private String catatan;

    public ItemPesanan(Menu menu, int jumlah, String catatan) {
        this.menu = menu;
        this.jumlah = jumlah;
        this.catatan = catatan;
    }

    public double getSubtotal() {
        return menu.getHarga() * jumlah;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getCatatan() {
        return catatan;
    }
}
