/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
/*
Nama:Carmel JH Silalahi
NIM:41425027
*/
import java.util.ArrayList;
import java.util.List;

// Abstract class untuk semua mantra perlindungan
abstract class MantraPerlindungan {

    // Method abstrak untuk mengaktifkan mantra
    public abstract void aktifkan();

    // Method abstrak untuk menonaktifkan mantra
    public abstract void nonaktifkan();
}

// Class Protego
class Protego extends MantraPerlindungan {

    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego dinonaktifkan.");
    }
}

// Class Fidelius
class Fidelius extends MantraPerlindungan {

    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Fidelius aktif. Secret Keeper: "
                + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Fidelius dinonaktifkan.");
    }
}

// Class MantraAntiApparition
class MantraAntiApparition extends MantraPerlindungan {

    private String area;

    public MantraAntiApparition(String area) {
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("Apparition dicegah di area " + area + ".");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Anti-Apparition di area "
                + area + " dinonaktifkan.");
    }
}

// Class sistem pertahanan
class SistemPertahananHogwarts {

    private List<MantraPerlindungan> daftarMantra;

    public SistemPertahananHogwarts() {
        daftarMantra = new ArrayList<>();
    }

    // Menambahkan mantra ke sistem
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
    }

    // Mengaktifkan semua mantra
    public void aktifkanSemuaMantra() {
        System.out.println("=== AKTIFKAN SEMUA MANTRA ===");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    // Menonaktifkan semua mantra
    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== NONAKTIFKAN SEMUA MANTRA ===");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

// Main class
public class SistemPertahanan {

    public static void main(String[] args) {

        // Membuat sistem pertahanan Hogwarts
        SistemPertahananHogwarts sistem =
                new SistemPertahananHogwarts();

        // Membuat beberapa mantra perlindungan
        MantraPerlindungan protego = new Protego();

        MantraPerlindungan fidelius =
                new Fidelius("Albus Dumbledore");

        MantraPerlindungan antiApparition =
                new MantraAntiApparition("Hogwarts");

        // Menambahkan mantra ke sistem
        sistem.tambahMantra(protego);
        sistem.tambahMantra(fidelius);
        sistem.tambahMantra(antiApparition);

        // Mengaktifkan semua mantra
        sistem.aktifkanSemuaMantra();

        // Menonaktifkan semua mantra
        sistem.nonaktifkanSemuaMantra();
    }
}
