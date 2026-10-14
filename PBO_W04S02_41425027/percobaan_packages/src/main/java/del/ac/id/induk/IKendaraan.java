/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author User
 */

package del.ac.id.induk;

public interface IKendaraan {
    void setJlhRoda(int value);
    void setDimensiKendaraan(int value);
    void setJlhSpion(int value);
    void setWarnaKendaraan(String value);
    void cetakInformasi(Object o);
    int getJlhRoda();
    int getDimensiKendaraan();
    int getJlhSpion();
    float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi);
    String getWarnaKendaraan();
}