/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
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