public class Hewan {
    String hewan;
    int kaki;
    String makanan;
    String type;
    public void namaHewan(String inputHewan) {
        hewan = inputHewan;
    }
    public void jumlahKaki(int inputKaki) {
        kaki = inputKaki;
    }
    public void makananHewan(String inputMakanan) {
        makanan = inputMakanan;
    }
    public void typeHewan(String inputType) {
        type = inputType;
    }
    public void infoHewan(){
        System.out.println(
                "Nama Hewan : " + hewan + "\n" +
                "Jumlah Kaki : " + kaki + "\n" +
                "Makanan : " + makanan + "\n" +
                "type : " + type);
    }
    public static void main(String[] args) {

        Hewan hewan1 = new Hewan();
        hewan1.namaHewan("Harimau");
        hewan1.jumlahKaki(4);
        hewan1.makananHewan("Daging");
        hewan1.typeHewan("Karnivora");
        hewan1.infoHewan();

        System.out.println();

        Hewan hewan2 = new Hewan();
        hewan2.namaHewan("Kerbau");
        hewan2.jumlahKaki(4);
        hewan2.makananHewan("Rumput");
        hewan2.typeHewan("Karnivora");
        hewan2.infoHewan();
    }
}
