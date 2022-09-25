import java.util.Scanner;

public class Pratikum1 {

    Scanner scn = new Scanner(System.in);
    private String nimMhs;


    public String getNimMhs() {
        return nimMhs;
    }

    public void setNimMhs() {

        try {
            System.out.print("Masukkan NIM Anda: ");
            nimMhs = scn.nextLine();

            if (nimMhs.length() != "202110370311".length()) {
                throw new Exception("NIM informatika harus memiliki kode 10370311");
            } else {
                System.out.println("NIM Anda: " + getNimMhs());
            }

//            if (nimMhs.length() > 15) {
//                throw new Exception("NIM tidak boleh lebih dari 15 karakter");
//            } else if (nimMhs.length() < 15) {
//                throw new Exception("NIM tidak boleh kurang dari 15 karakter");
//            } else {
//                System.out.println("NIM Anda: " + nimMhs);
//            }

        } catch (Exception e) {
            System.out.println("Error: " + e);

            setNimMhs();
        }
    }

    public static void main(String[] args) {

        Pratikum1 p1 = new Pratikum1();
        p1.setNimMhs();

    }
}
