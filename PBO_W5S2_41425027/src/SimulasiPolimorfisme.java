/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

class KendaraanEkspedisi {

    protected String nama;

    public KendaraanEkspedisi(String nama) {
        this.nama = nama;
    }

    public void angkutBarang() {
        System.out.println(nama + " mengangkut barang.");
    }
}

class Truk extends KendaraanEkspedisi {

    public Truk(String nama) {
        super(nama);
    }

    @Override
    public void angkutBarang() {
        System.out.println(
            nama + " mengangkut barang dalam jumlah besar."
        );
    }
}

class MobilVan extends KendaraanEkspedisi {

    public MobilVan(String nama) {
        super(nama);
    }

    @Override
    public void angkutBarang() {
        System.out.println(
            nama + " mengangkut barang untuk distribusi kota."
        );
    }
}

public class SimulasiPolimorfisme {

    public static void main(String[] args) {

        KendaraanEkspedisi[] armada = {
            new Truk("Truk Box"),
            new MobilVan("Mobil Van")
        };

        for (KendaraanEkspedisi kendaraan : armada) {
            kendaraan.angkutBarang();
        }
    }
}