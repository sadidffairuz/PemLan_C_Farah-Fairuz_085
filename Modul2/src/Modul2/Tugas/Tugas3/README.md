# Pemrograman Lanjut C - Farah Fairuz - 085

# Program Pengingat Minum Obat
program Ini membantu pengguna agar tidak lupa meminum obat sesuai jadwal. Program dikembangkan dua kali: sebelum dan sesudah proses refactoring

# Sebelum Refactoring
Kode masih sederhana dan belum mengkuti prinsip OOP.
Ciri-ciri:
- Semua data disimpan dalam ArrayList tanpa class khusus
- tidak ada konsep encapsulation dan abstraction.
- Nilai 3 jam sekali masih berupa magic number.
- Mtehod main() terlalu panjang dan tidak modular

# Sesudah Refactoring
Program diperbaiki agar lebih terstruktur dan efisien menggunakan prinsip OOP dam sembilan teknik refactoring.
1. Extract Method
   Memisahan kode tampilan menjadi method tampilkanHeader() dan tampilkanDetailObat()
2. Rename Method
   Mengubah nama method menjadi tampilkanPengingat() agar lebih deskriptif
3. Move Method
   Method main() dipindahkan ke kelas main agar kelas Pengingat hanya menangani lpgika pengingat.
4. Introduce Parameter Object
   Menggunakan objek Obat sebagai parameter dalam daftar pengingat.
5. Extract Interface
   Membuat interface AksiPengingat untuk mendefinisikan perilaku umum pengingat obat.
6. Replace Magic Number with Symbolic Constant
   Mengganti angka 3 menjadi konstanta INTERVAL_JAM.
7. Encapsulate Field
   Menjadikan atribut di Obat dan Item sebagai private dan menambahkan getter serta setter
8. Inline Variable
   Menghapus variabel sementara yang tidak diperlukan di method main()
9. Extract Superclass
   Menambahkan superclass Item sebagai dasar untuk atribut umum seperti nama.
