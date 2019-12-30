/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_11;


public class NestedClass {
    String nama = "MUTU";
    String nim = "L200184220";
   
    public void printNama() {
        System.out.println(nama + " : " + nim);
    }
    
    static class StaticNestedClass {
        static String jurusan = "Informatika";
    }
    
    class InnerClass {
        public String getJurusan() {
            return StaticNestedClass.jurusan;
        }
    }
}
