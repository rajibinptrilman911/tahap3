class Manager extends Karyawan {
    private double insentif;
    private String divisi;

    public Manager(String nama, double gajiPokok, Perusahaan perusahaan, double insentif, String divisi) {
        super(nama, gajiPokok, perusahaan);
        setInsentif(insentif);
        setDivisi(divisi);
    }

    public void setInsentif(double insentif) {
        if (insentif >= 0) {
            this.insentif = insentif;
        } else {
            throw new IllegalArgumentException("Insentif tidak boleh negatif!");
        }
    }

    public void setDivisi(String divisi) {
        if (divisi != null && !divisi.trim().isEmpty()) {
            this.divisi = divisi;
        } else {
            throw new IllegalArgumentException("Divisi tidak boleh kosong!");
        }
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + insentif;
    }

    @Override
    public void infoGaji() {
        System.out.println("Nama Manager : " + getNama());
        System.out.println("Divisi       : " + divisi);
        System.out.println("Perusahaan   : " + getPerusahaan().getNamaPerusahaan());
        System.out.println("Gaji Pokok   : " + Util.formatRupiah(getGajiPokok()));
        System.out.println("Insentif     : " + Util.formatRupiah(insentif));
        System.out.println("Total Gaji   : " + Util.formatRupiah(hitungGaji()));
        System.out.println("------------------------------------");
    }
}
