public class Dosen {
    String nama;
    int nik;
    String pendidikan;
    String tglLahir;

    public void tampilkanNama(String beriNama){
        nama = beriNama;
        System.out.println("Nama : " + nama);
    }
    public void tampilkanTglLahir(String beriTanggal) {
        tglLahir = beriTanggal;
        System.out.println("Tanggal Lahir : " + tglLahir);
    }
    public void tampilkanNik(int beriNik) {
        nik = beriNik;
        System.out.println("NIK : " + nik);
    }

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.tampilkanNama("Ganno");
        dosen.tampilkanTglLahir("7 November 1999");
        dosen.tampilkanNik(71199);
    }
}
