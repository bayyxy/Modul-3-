/**
 * Interface (Kerangka) untuk mendefinisikan kontrak
 * untuk semua bangun datar.
 *
 * Setiap class bangun datar yang mengimplementasikan interface ini
 * wajib menyediakan method untuk menghitung luas dan keliling.
 */
public interface BangunDatar {
    /**
     * Kontrak method untuk menghitung luas bangun datar.
     * @return double Luas bangun datar.
     */
    double hitungLuas();

    /**
     * Kontrak method untuk menghitung keliling bangun datar.
     * @return double Keliling bangun datar.
     */
    double hitungKeliling();
}