/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum080425;

/**
 *
 * @author buyal
 */
public class Nasabah {
    private final String namaAwal;
    private final String namaAkhir;
    private Tabungan tabungan;

    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }

    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    @Override
    public String toString() {
        /*return namaAwal + " " + namaAkhir + " - " + (tabungan != null ? 
        tabungan.toString() : "Tidak ada tabungan");*/
            if (tabungan != null){
                return namaAwal + " " + namaAkhir + " - " + tabungan.toString();
            } else {
                return namaAwal + " " + namaAkhir + " - Tidak ada tabungan";
            }
        }
}
