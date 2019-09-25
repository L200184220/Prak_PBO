/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localvariable1;
public class LocalVariable1 {
    int usia = 0;

    public void hitungUsia() {
        int usia = 0;
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya : " + usia);
    }
    public void beratBadan() {
        int beratBadan = 0;
        int beratLahir = 2;

        beratBadan = beratLahir + (usia / 2);

        System.out.println("Berat badan : " + beratBadan);
    }
    public static void main(String[] args) {
        LocalVariable1 localvariable1 = new LocalVariable1();
        localvariable1.hitungUsia();
        localvariable1.beratBadan();
    }
}

/*
Answer No. 3
Right now we can call "usia" variable, because the variabel is instance variable that take place outside any method.
 */