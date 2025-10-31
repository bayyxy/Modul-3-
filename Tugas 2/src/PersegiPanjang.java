/**
 * Merepresentasikan bangun datar Persegi Panjang.
 * Class ini mengimplementasikan interface BangunDatar.
 */
public class PersegiPanjang implements BangunDatar {
    private double panjang;
    private double lebar;

    /**
     * Konstruktor untuk membuat objek PersegiPanjang baru.
     * @param panjang Panjang dari persegi panjang.
     * @param lebar   Lebar dari persegi panjang.
     */
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    /**
     * Menghitung luas persegi panjang.
     * Rumus: panjang * lebar.
     * @return double Luas persegi panjang.
     */
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    /**
     * Menghitung keliling persegi panjang.
     * Rumus: 2 * (panjang + lebar).
     * @return double Keliling persegi panjang.
     */
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}