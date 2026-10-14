/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
/*
Nama: Carmel JH Silalahi
NIM: 41425027
*/

class MesinTarif {
    private String kotaAsal;

    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }
    
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;

        if (isExpress) {
            total += 20000;
        }
        return total;
    }
}

public class SimulasiOverloading {
    public static void main(String[] args) {
        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");
        System.out.println("Ongkir Biasa (2.0 Kg) : Rp " + tarif.hitungOngkir(2.0));
        System.out.println("Ongkir + Asuransi (Barang 5Jt): Rp " + tarif.hitungOngkir(2.0, 5000000.0));
        System.out.println("Ongkir Express (2.0 Kg)    : Rp " + tarif.hitungOngkir(2.0, true));
    }
}
/*
    public int hitungOngkir(double beratKg) {
        return (int)(beratKg * 10000);
    }

Program akan error karena kedua method mempunyai:
Nama method       : hitungOngkir
Parameter         : double beratKg
*/