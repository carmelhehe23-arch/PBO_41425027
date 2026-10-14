package overloading;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author User
 */

public class Mantra {

    // Method ucapan() dengan satu parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload method ucapkan() dengan dua parameter
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload method ucapkan() dengan tiga parameter
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra();

        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
    }
}
/*
Nama:Carmel JH Silalahi
NIM:41425027

1. Apa yang terjadi jika salah satu method overloading dihapus?

Jika salah satu method overloading dihapus, pemanggilan method yang membutuhkan parameter tersebut akan mengalami error karena tidak ada method yang sesuai dengan jumlah atau tipe parameter yang diberikan.

2. Bisakah urutan parameter dibuat berbeda?

Bisa. Selama tipe parameter berbeda atau urutannya berbeda, Java menganggapnya sebagai method yang berbeda. Contohnya ucapkan(String, int) dan ucapkan(int, String).
*/