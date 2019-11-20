public class Karyawan {
    String nama;
    String alamat;
    String jabatan;
    double gaji;

    public void tampilkanNama(String beriNama){
        nama = beriNama;
        System.out.println("Nama : " + nama);
    }
    public void tampilkanJabatan(String beriJabatan) {
        jabatan = beriJabatan;
        System.out.println("Jabatan : " + jabatan);
    }
    public void tampilkanAlamat(String beriAlamat) {
        alamat = beriAlamat;
        System.out.println("Alamat : " + alamat);
    }
    public void tampilkanGaji(double beriGaji) {
        gaji = beriGaji;
        System.out.println("Gaji : Rp. " + gaji);
    }
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        karyawan.tampilkanNama("Tribuana");
        karyawan.tampilkanJabatan("Teknisi IT");
        karyawan.tampilkanAlamat("Solo");
        karyawan.tampilkanGaji(3500000);
    }
}
