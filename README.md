# Kalkulator Bangun Datar (Tugas 2)

Program ini adalah aplikasi konsol (CLI) sederhana yang ditulis dalam Java untuk menghitung luas dan keliling dari berbagai bangun datar berdasarkan input pengguna.

## Fitur

* Kalkulator interaktif berbasis menu.
* Hitung Luas untuk: Persegi, Persegi Panjang, Lingkaran.
* Hitung Keliling untuk: Persegi, Persegi Panjang, Lingkaran.

## Struktur Kode

Proyek ini berisi dua pendekatan implementasi:

### 1. Pendekatan Berorientasi Objek (OOP)

Kode ini mencakup struktur OOP yang baik menggunakan `interface` dan `class`:

* **`BangunDatar.java`**: Sebuah `interface` yang mendefinisikan method wajib `hitungLuas()` dan `hitungKeliling()`.
* **`Persegi.java`**: *Class* yang mengimplementasikan `BangunDatar` untuk persegi.
* **`PersegiPanjang.java`**: *Class* yang mengimplementasikan `BangunDatar` untuk persegi panjang.
* **`Lingkaran.java`**: *Class* yang mengimplementasikan `BangunDatar` untuk lingkaran.

### 2. Pendekatan Prosedural (Implementasi `Main.java` Saat Ini)

*Class* `Main.java` saat ini **TIDAK** menggunakan *class-class* OOP di atas.

Sebaliknya, `Main.java` berisi logika kalkulasi secara langsung di dalam *method-method static* (misalnya `Lpersegi()`, `Kpersegi()`, `Llingkaran()`, dll.) dan mengelola alur program (menu dan input) sepenuhnya di dalam *class* `Main`.

* **`Main.java`**: Bertindak sebagai *driver* program.
* **`getMenuUtama(Scanner)`**: Menampilkan menu utama (Luas, Keliling, Keluar).
* **`Pilihan()`**: Menampilkan sub-menu (Persegi, Persegi Panjang, Lingkaran).
* **`L...(Scanner)` dan `K...(Scanner)`**: Method *static private* yang menangani input dan kalkulasi untuk setiap bangun datar.

## Cara Menjalankan

Anda dapat mengkompilasi dan menjalankan program ini dari terminal.

### 1. Kompilasi
Pastikan Anda berada di direktori `Tugas 2/` dan semua file `.java` berada di dalam folder `src/`.

```bash
# Membuat direktori 'out' jika belum ada
mkdir -p out

# Mengkompilasi semua file .java dari 'src' ke 'out'
javac -d out src/*.java