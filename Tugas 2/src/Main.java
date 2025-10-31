import java.util.Scanner;

/**
 * Titik masuk utama (entry point) untuk aplikasi Kalkulator Bangun Datar.
 *
 * Class ini mengelola alur program, input pengguna, dan perhitungan
 * menggunakan method-method static (pendekatan prosedural).
 *
 * Catatan: Implementasi Main.java saat ini TIDAK menggunakan
 * class OOP (Persegi, Lingkaran, PersegiPanjang) yang tersedia,
 * melainkan melakukan kalkulasi langsung di dalam method static-nya.
 */
public class Main {

    /**
     * Method main yang menjalankan loop menu utama aplikasi.
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int menuUtama = getMenuUtama(scanner);

            if (menuUtama == 1) { // Hitung Luas
                System.out.println("\n--- Pilih Bangun Datar untuk Dihitung Luasnya ---");
                Pilihan();
                int pilihanBangun = scanner.nextInt();

                if (pilihanBangun == 1) {
                    Lpersegi(scanner);
                } else if (pilihanBangun == 2) {
                    Lpersegipanjang(scanner);
                } else if (pilihanBangun == 3) {
                    Llingkaran(scanner);
                } else {
                    System.out.println("Pilihan bangun datar tidak valid.");
                }

            } else if (menuUtama == 2) { // Hitung Keliling
                System.out.println("\n--- Pilih Bangun Datar untuk Dihitung Kelilingnya ---");
                Pilihan();
                int pilihanBangun = scanner.nextInt();

                if (pilihanBangun == 1) {
                    Kpersegi(scanner);
                } else if (pilihanBangun == 2) {
                    Kpersegipanjang(scanner);
                } else if (pilihanBangun == 3) {
                    Klingkaran(scanner);
                } else {
                    System.out.println("Pilihan bangun datar tidak valid.");
                }

            } else if (menuUtama == 3) { // Keluar
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan menu utama tidak valid.");
            }
        }
        scanner.close();
    }

    /**
     * Menghitung dan menampilkan keliling lingkaran.
     * @param scanner Objek Scanner untuk membaca input radius.
     */
    private static void Klingkaran(Scanner scanner) {
        System.out.print("Masukkan radius: ");
        double radius = scanner.nextDouble();
        double keliling = 2 * 3.14159 * radius; // Menggunakan PI hardcode
        System.out.printf("Keliling Lingkaran: %.2f\n", keliling);
    }

    /**
     * Menghitung dan menampilkan keliling persegi panjang.
     * @param scanner Objek Scanner untuk membaca input panjang dan lebar.
     */
    private static void Kpersegipanjang(Scanner scanner) {
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();
        double keliling = 2 * (panjang + lebar);
        System.out.printf("Keliling Persegi Panjang: %.2f\n", keliling);
    }

    /**
     * Menghitung dan menampilkan keliling persegi.
     * @param scanner Objek Scanner untuk membaca input sisi.
     */
    private static void Kpersegi(Scanner scanner) {
        System.out.print("Masukkan panjang sisi: ");
        double sisi = scanner.nextDouble();
        double keliling = 4 * sisi;
        System.out.printf("Keliling Persegi: %.2f\n", keliling);
    }

    /**
     * Menghitung dan menampilkan luas lingkaran.
     * @param scanner Objek Scanner untuk membaca input radius.
     */
    private static void Llingkaran(Scanner scanner) {
        System.out.print("Masukkan radius: ");
        double radius = scanner.nextDouble();
        double luas = 3.14159 * radius * radius; // Menggunakan PI hardcode
        System.out.printf("Luas Lingkaran: %.2f\n", luas);
    }

    /**
     * Menghitung dan menampilkan luas persegi panjang.
     * @param scanner Objek Scanner untuk membaca input panjang dan lebar.
     */
    private static void Lpersegipanjang(Scanner scanner) {
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();
        double luas = panjang * lebar;
        System.out.printf("Luas Persegi Panjang: %.2f\n", luas);
    }

    /**
     * Menghitung dan menampilkan luas persegi.
     * @param scanner Objek Scanner untuk membaca input sisi.
     */
    private static void Lpersegi(Scanner scanner) {
        System.out.print("Masukkan panjang sisi: ");
        double sisi = scanner.nextDouble();
        double luas = sisi * sisi;
        System.out.printf("Luas Persegi: %.2f\n", luas);
    }

    /**
     * Menampilkan submenu pilihan bangun datar (Persegi, Persegi Panjang, Lingkaran).
     */
    private static void Pilihan() {
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Pilih bangun datar (1-3): ");
    }

    /**
     * Menampilkan menu utama (Hitung Luas, Hitung Keliling, Keluar)
     * dan mengambil input pilihan user.
     * @param scanner Objek Scanner untuk membaca input menu.
     * @return int Pilihan menu user (1-3).
     */
    private static int getMenuUtama(Scanner scanner) {
        System.out.println("\n===== Menu Kalkulator =====");
        System.out.println("1. Hitung Luas Bangun Datar");
        System.out.println("2. Hitung Keliling Bangun Datar");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu (1-3): ");
        int menuUtama = scanner.nextInt();
        return menuUtama;
    }
}