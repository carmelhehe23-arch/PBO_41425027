/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package del.ac.id.induk;

/**
 *
 * @author User
 */
public class Kendaraan implements IKendaraan {
    private int jlhRoda, dimensiKendaraan, jlhSpion;
    private String warnaKendaraan;

    public Kendaraan() {}

    @Override
    public void setJlhRoda(int value) {
        jlhRoda = value;
    }

    @Override
    public void setDimensiKendaraan(int value) {
        dimensiKendaraan = value;
    }

    @Override
    public void setJlhSpion(int value) {
        jlhSpion = value;
    }

    @Override
    public void setWarnaKendaraan(String value) {
        warnaKendaraan = value;
    }

    @Override
    public void cetakInformasi(Object o) {
        if (o == null) System.out.println("Object is Null");
    }

    @Override
    public int getJlhRoda() {
        return jlhRoda;
    }

    @Override
    public int getDimensiKendaraan() {
        return dimensiKendaraan;
    }

    @Override
    public int getJlhSpion() {
        return jlhSpion;
    }

    @Override
    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    @Override
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        return jlhTorsi * panjangGagang * rasioGigi;
    }
}
