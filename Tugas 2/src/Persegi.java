/**
 * Merepresentasikan bangun datar Persegi.
 * Class ini mengimplementasikan interface BangunDatar.
 */
public class Persegi implements BangunDatar {
    private double sisi;

    /**
     * Konstruktor untuk membuat objek Persegi baru.
     * @param sisi Panjang sisi persegi.
     */
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    /**
     * Menghitung luas persegi.
     * Rumus: sisi * sisi.
     * @return double Luas persegi.
     */
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    /**
     * Menghitung keliling persegi.
     * Rumus: 4 * sisi.
     * @return double Keliling persegi.
     */
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}