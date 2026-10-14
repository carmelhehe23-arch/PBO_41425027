package duniasihir;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
import java.util.ArrayList;
import java.util.List;

abstract class Mantra {
    private String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

class Penyihir {
    private String nama;
    private List<Mantra> mantraList;

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");

        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos"); // Harry belum belajar Lumos

        // Tambahkan mantra Lumos dan coba lagi
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");
    }
}
/*
Nama:Carmel JH Silalahi
NIM:41425027
1. Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?

Polymorphism dan abstract class bekerja sama dengan cara Mantra menjadi abstract class yang menjadi dasar untuk beberapa jenis mantra seperti Expelliarmus, ExpectoPatronum, dan Lumos. Setiap class turunan memiliki implementasi efek() yang berbeda. Dengan polymorphism, objek-objek tersebut dapat disimpan dalam List<Mantra> dan dipanggil melalui tipe Mantra, tetapi masing-masing tetap menjalankan efek sesuai jenis mantranya.

2. Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah kelas Penyihir? Apakah mudah? Mengapa?

Mudah, karena kita hanya perlu membuat class mantra baru yang extends Mantra, kemudian mengimplementasikan method efek(). Setelah itu mantra tersebut dapat dipelajari oleh Penyihir menggunakan belajarMantra(), tanpa perlu mengubah isi class Penyihir. Contohnya pada modul, Lumos ditambahkan sebagai class baru dan kemudian dipelajari oleh Harry Potter.*/