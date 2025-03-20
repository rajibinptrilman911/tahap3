import java.util.ArrayList;
import java.util.List;

class Perusahaan {
    private final String namaPerusahaan;
    private List<Karyawan> daftarKaryawan;

    public Perusahaan(String namaPerusahaan) {
        if (namaPerusahaan == null || namaPerusahaan.isEmpty()) {
            throw new IllegalArgumentException("Nama perusahaan tidak boleh kosong.");
        }
        this.namaPerusahaan = namaPerusahaan;
        this.daftarKaryawan = new ArrayList<>();
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public void tampilkanKaryawan() {
        System.out.println("Daftar Karyawan di " + namaPerusahaan + ":");
        for (Karyawan karyawan : daftarKaryawan) {
            karyawan.infoGaji();
        }
    }
}
