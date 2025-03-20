class Programmer extends Karyawan {
    private double bonus;

    public Programmer(String nama, double gajiPokok, Perusahaan perusahaan, double bonus) {
        super(nama, gajiPokok, perusahaan);
        setBonus(bonus);
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            throw new IllegalArgumentException("Bonus tidak boleh negatif!");
        }
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + bonus;
    }

    @Override
    public void infoGaji() {
        System.out.println("Nama Programmer : " + getNama());
        System.out.println("Perusahaan      : " + getPerusahaan().getNamaPerusahaan());
        System.out.println("Gaji Pokok      : " + Util.formatRupiah(getGajiPokok()));
        System.out.println("Bonus           : " + Util.formatRupiah(bonus));
        System.out.println("Total Gaji      : " + Util.formatRupiah(hitungGaji()));
        System.out.println("------------------------------------");
    }
}
