public class Buku {
    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;

    public Buku() {
        namaPengarang = "Motwkel mhmoud mohmed";
        judulBuku = "Pemrograman Berorientasi Objek";
        tahunTerbit = 2018;
        cetakanKe = 1;
        hargaJual = 75000.00;
    }

    public Buku(String namaPengarang, String judulBuku) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        System.out.println("Nama Pengarang : " + namaPengarang);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println();
    }

    public Buku(String judulBuku, int tahunTerbit) {
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        System.out.println("Judul Buku = " + judulBuku);
        System.out.println("Tahun Terbit = " + tahunTerbit);
        System.out.println();
    }

    public Buku(int tahunTerbit, int cetakanKe) {
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Cetakan Ke : " + cetakanKe);
        System.out.println();
    }

    public Buku(int cetakanKe, double hargaJual) {
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
        System.out.println("Cetakan Ke : " + cetakanKe);
        System.out.println("Harga Jual : " + hargaJual);
        System.out.println();
    }

    public void info() {
        System.out.println("Nama Pengarang : " + namaPengarang);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Cetakan ke : " + cetakanKe);
        System.out.println("Harga Jual : " + hargaJual);
        System.out.println();
    }
}
