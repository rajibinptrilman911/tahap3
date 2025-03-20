class Karyawan {
    private String nama;
    private double gajiPokok;
    private Perusahaan perusahaan;

    public Karyawan(String nama, double gajiPokok, Perusahaan perusahaan) {
        setNama(nama);
        setGajiPokok(gajiPokok);
        this.perusahaan = perusahaan;
        perusahaan.tambahKaryawan(this);
    }

    public void setNama(String nama) {
        if (nama.length() >= 4) {
            this.nama = nama;
        } else {
            throw new IllegalArgumentException("Nama harus minimal 4 karakter!");
        }
    }

    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok > 0) {
            this.gajiPokok = gajiPokok;
        } else {
            throw new IllegalArgumentException("Gaji pokok harus lebih dari 0!");
        }
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public double hitungGaji() {
        return gajiPokok;
    }

    public void infoGaji() {
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Perusahaan    : " + perusahaan.getNamaPerusahaan());
        System.out.println("Total Gaji    : " + Util.formatRupiah(hitungGaji()));
        System.out.println("------------------------------------");
    }
}
