/*.
 */
package nonvoidmethod;
public class NonVoidMethod {
    public String getNama() {
        String nama = "Mutu";
        return nama;
    }

    public String getNIM() {
        String nim = "L200184220";
        return nim;
    }

    public static void main(String[] args) {
        NonVoidMethod nonvoidmethod = new NonVoidMethod();
        System.out.println("Nama : " + nonvoidmethod.getNama());
        System.out.println("NIM : " + nonvoidmethod.getNIM());
    }
}
    
    

