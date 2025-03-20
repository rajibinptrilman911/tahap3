public class Main {
    public static void main(String[] args) {
        Perusahaan ptInovasi = new Perusahaan("PT. Inovasi Teknologi");

        Karyawan karyawan1 = new Karyawan("Andi", 5000000, ptInovasi);
        Programmer programmer1 = new Programmer("Budi", 6000000, ptInovasi, 1500000);
        Manager manager1 = new Manager("Citra", 7000000, ptInovasi, 2000000, "IT");

        ptInovasi.tampilkanKaryawan();
    }
}

