/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package del.ac.id.main;

/**
 *
 * @author User
 */

import del.ac.id.anakan.Mobil;
import del.ac.id.anakan.Motor;
import del.ac.id.anakan.Sepeda;

public class Percobaan_packages {
    
    public static void main(String[] args) {
        Motor objMotor = new Motor();
        objMotor.setDimensiKendaraan(274);
        objMotor.setJlhRoda(2);
        objMotor.setJlhSpion(2);
        objMotor.setWarnaKendaraan("Hitam");
        objMotor.setJlhTorsi(1);
        objMotor.setPanjangGagang((float) 15.5);
        objMotor.setRasioGigi((float) 4.2);
        objMotor.setFaktorPembagi(2);

        Mobil objMobil = new Mobil();
        objMobil.setDimensiKendaraan(632);
        objMobil.setJlhRoda(4);
        objMobil.setJlhSpion(2);
        objMobil.setWarnaKendaraan("Grey");
        objMobil.setJlhTorsi(1);
        objMobil.setPanjangGagang((float) 20.5);
        objMobil.setRasioGigi((float) 50.4);
        objMobil.setFaktorPembagi(3);

        Sepeda objSepeda = new Sepeda();
        objSepeda.setDimensiKendaraan(24);
        objSepeda.setJlhRoda(2);
        objSepeda.setJlhSpion(0);
        objSepeda.setWarnaKendaraan("Putih");

        objMotor.cetakInformasi(objMotor);
        objMobil.cetakInformasi(objMobil);
        objSepeda.cetakInformasi(objSepeda);
    }
}