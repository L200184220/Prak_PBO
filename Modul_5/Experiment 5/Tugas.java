public class Tugas {
    String nama;
    String tanggalLahir;

    public Tugas() {
        nama = "motwkel mhmoud mohmed";
        tanggalLahir = "30 august 1996";
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println();
    }

    public Tugas(String nama, String tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println();
    }
}
