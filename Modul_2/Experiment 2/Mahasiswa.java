public class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    int semester;

    public void tampilkanNama(String beriNama){
        nama = beriNama;
        System.out.println("Nama : " + nama);
    }
    public void tampilkanNim(String beriNim) {
        nim = beriNim;
        System.out.println("NIM : " + nim);
    }
    public void tampilkanAlamat(String beriAlamat) {
        alamat = beriAlamat;
        System.out.println("Alamat : " + alamat);
    }
    public void tampilkanSemester(int beriSemester) {
        semester = beriSemester;
        System.out.println("Semester : " + semester);
    }
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tampilkanNama("Kurniaji");
        mahasiswa.tampilkanNim("L200184092");
        mahasiswa.tampilkanAlamat("Solo");
        mahasiswa.tampilkanSemester(3);
    }
}
