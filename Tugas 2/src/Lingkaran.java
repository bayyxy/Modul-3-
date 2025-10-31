/**
 * Merepresentasikan bangun datar Lingkaran.
 * Class ini mengimplementasikan interface BangunDatar.
 */
public class Lingkaran implements BangunDatar {
    // Menggunakan konstanta PI bawaan Java untuk presisi lebih tinggi
    // private static final double DOUBLE = 3.14159265359; (Kode asli)
    // double PI = DOUBLE; (Kode asli)

    // Perbaikan: Langsung gunakan konstanta Math.PI
    private static final double PI = Math.PI;

    private double radius;

    /**
     * Konstruktor untuk membuat objek Lingkaran baru.
     * @param radius Jari-jari (radius) lingkaran.
     */
    public Lingkaran(double radius) {
        this.radius = radius;
    }

    /**
     * Menghitung luas lingkaran.
     * Rumus: PI * radius * radius.
     * @return double Luas lingkaran.
     */
    @Override
    public double hitungLuas() {
        // Menggunakan konstanta PI yang sudah didefinisikan
        return PI * radius * radius;
    }

    /**
     * Menghitung keliling lingkaran.
     * Rumus: 2 * PI * radius.
     * @return double Keliling lingkaran.
     */
    @Override
    public double hitungKeliling() {
        return 2 * PI * radius;
    }
}